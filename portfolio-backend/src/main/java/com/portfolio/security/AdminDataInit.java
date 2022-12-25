package com.portfolio.security;


import com.portfolio.entity.User;
import com.portfolio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


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
        admin.setUsername("admin");
        admin.setEmail("admin@admin.com");
        admin.setPassword(bCryptPasswordEncoder.encode("123456"));
        userRepository.save(admin);
    }

}
