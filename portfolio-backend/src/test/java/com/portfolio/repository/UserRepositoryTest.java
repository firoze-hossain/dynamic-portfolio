package com.portfolio.repository;

import com.portfolio.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        User newUser = new User();
        newUser.setUsername("firoze");
        newUser.setEmail("firoze.hossain01@yahoo.com");
        newUser.setPassword("firoze28");
        userRepository.save(newUser);
    }

    @Test
    void findByUsername() {
        User returnedUser = userRepository.findByUsername("existingUser");
        assertEquals("existingUser", returnedUser.getUsername());
    }

}