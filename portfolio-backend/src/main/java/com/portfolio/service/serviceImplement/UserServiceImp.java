package com.portfolio.service.serviceImplement;

import com.portfolio.dto.PasswordDTO;
import com.portfolio.entity.GenericUserData;
import com.portfolio.entity.User;
import com.portfolio.repository.UserRepository;
import com.portfolio.security.JWTMethod;
import com.portfolio.service.GenericUserDataService;
import com.portfolio.service.UserService;
import com.portfolio.util.CustomizedSpecification;
import com.portfolio.util.ObjectMethod;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.Nullable;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;



@Service
@Transactional
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private GenericUserDataService genericUserDataService;
    @Autowired
    private List<Class<? extends GenericUserData>> userDataEntityClasses;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private ObjectMethod objectMethod;

    public User signUp(User user) {
        if (checkUsername(user)) {
            return userRepository.save(user);
        } else {
            throw new IllegalArgumentException("Duplicate username.");
        }
    }

    public boolean checkUsername(User user) {
        return userRepository.findByUsername(user.getUsername()) == null;
    }

    public Page<User> filterUsers(Integer page, Integer size, @Nullable Integer[] industry, Integer[] gender,
                                  @Nullable String orders, @Nullable boolean ascending) {
        Specification<User> spec = new CustomizedSpecification<>("isPublic", "=", true);
        if (industry != null) {
            Specification<User> s = null;
            for (Integer item : industry) {
                Specification<User> ns = new CustomizedSpecification<>("industry", "=", item);
                s = (s == null) ? ns : s.or(ns);
            }
            spec = spec.and(s);
        }
        if (gender != null) {
            Specification<User> s = null;
            for (Integer item : gender) {
                Specification<User> ns = new CustomizedSpecification<>("gender", "=", item);
                s = (s == null) ? ns : s.or(ns);
            }
            assert spec != null;
            spec = spec.and(s);
        }
        Sort.Direction direction = ascending ? Sort.Direction.ASC : Sort.Direction.DESC;
        return (orders == null) ? userRepository.findAll(spec, PageRequest.of(page, size)) :
                userRepository.findAll(spec, PageRequest.of(page, size, Sort.by(direction, orders)));
    }

    public List<Object> customizedFind(Long id, String name, int page, int size) {
//        Query q = em.createNativeQuery("select email as email, username as usersdf, admin as adm, degree as deg " +
//                "from user join education on user.id = education.user_id");
//
//        q.unwrap(NativeQueryImpl.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
//
//        List<Object> res = q.getResultList();
//
//        return res;
        return null;
    }

    @Override
    @PreAuthorize("hasPermission(#id, 'User', 'read')")
    public User getUser(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new NullPointerException("User not found."));
    }

    @Override
    @PreAuthorize("hasPermission(#id, 'User', 'write')")
    public User patchUser(Long id, Map<String, Object> updateFields) {
        User originalUser = getUser(id);
        if (updateFields.containsKey("password") || updateFields.containsKey("admin")
                || (updateFields.containsKey("id") && id.equals(updateFields.get("id")))) {
            throw new IllegalArgumentException("Forbidden argument.");
        }
        return userRepository.save(objectMethod.update(originalUser, updateFields));
    }

    @Override
    public void changePassword(Long id, PasswordDTO passwordDTO) {
        User targetUser = getUser(id);
        if (bCryptPasswordEncoder.matches(passwordDTO.getCurrentPassword(), targetUser.getPassword())) {
            targetUser.setPassword(passwordDTO.getNewPassword());
            userRepository.save(targetUser);
        } else throw new AccessDeniedException("Wrong password.");
    }

    @Override
    public String createSharedLink(Long time) {
        return JWTMethod.createSharedLink(
                (Long) SecurityContextHolder.getContext().getAuthentication().getPrincipal(), time);
    }

    @Override
    @PreAuthorize("hasAuthority('ADMIN')")
    public Page<User> searchUser(String name, Integer page, Integer size){
        Specification<User> spec = new CustomizedSpecification<>("username", "!=", "admin");
        if(name != null) spec = spec.and(new CustomizedSpecification<>("username", "%", name));
        return userRepository.findAll(spec, PageRequest.of(page, size));
    }

    @Override
    @PreAuthorize("hasAuthority('ADMIN')")
    public void deleteUser(Long id){
        User targetUser = getUser(id);
        if(targetUser.isAdmin()){
            throw new IllegalArgumentException("Cannot delete admin.");
        }
        for (Class<? extends GenericUserData> clazz : userDataEntityClasses) {
            for (GenericUserData data: genericUserDataService.getAllObjects(id, clazz)) {
                genericUserDataService.deleteObject(id, data.getId(), clazz);
            }
        }
        userRepository.delete(targetUser);
    }

}
