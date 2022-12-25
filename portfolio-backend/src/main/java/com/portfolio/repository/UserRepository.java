package com.portfolio.repository;


import com.portfolio.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {

    User findByUsername(String username);

//    @Query(value = "SELECT new COMP90082.team18.ePortfolioAPI.DTO.UserDTO(u.username, u.email, e.degree, e.grade)" +
//            " FROM User u JOIN Education e ON u.id = e.user.id")
//    Page<UserDTO> resfindCustomized(Pageable pageable);

}
