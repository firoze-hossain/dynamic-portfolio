package com.portfolio.repository;

import com.portfolio.entity.GenericUserData;
import com.portfolio.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface UserDataRepository<T extends GenericUserData> extends JpaRepository<T, Long> {
    List<T> findByUser(User user);
}
