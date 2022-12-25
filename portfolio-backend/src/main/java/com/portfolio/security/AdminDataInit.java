package com.portfolio.security;


import com.portfolio.entity.User;
import com.portfolio.entity.userDataEntity.WorkExperience;
import com.portfolio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Locale;


@Component
public class AdminDataInit {
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    private void initAdmin(){
        User admin = userRepository.findByUsername("admin");
        if(admin != null){
            return;
        }
        admin = new User();
        admin.setAdmin(true);
        admin.setUsername("firoze");
        admin.setEmail("firoze.hossain01@yahoo.com");
        admin.setAddress("Mirpur");
        admin.setCountry("Bangladesh");
        admin.setFirstName("Md. Firoze");
        admin.setLastName("Hossain");
        admin.setHeadline("Junior Software Engineer");
        admin.setPassword(bCryptPasswordEncoder.encode("firoze28"));
        userRepository.save(admin);
    }

}
