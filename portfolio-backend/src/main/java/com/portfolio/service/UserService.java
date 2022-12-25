package com.portfolio.service;


import com.portfolio.dto.PasswordDTO;
import com.portfolio.entity.User;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;

public interface UserService {
    User signUp(User user);

    boolean checkUsername(User user);

    Page<User> filterUsers(Integer page, Integer size, Integer[] industry, Integer[] gender, String orders, boolean ascending);

    List<Object> customizedFind(Long id, String name, int page, int size);

    User getUser(Long id);

    User patchUser(Long id, Map<String, Object> updateFields);

    void changePassword(Long id, PasswordDTO passwordDTO);

    String createSharedLink(Long time);

    Page<User> searchUser(String name, Integer page, Integer size);

    void deleteUser(Long id);

}
