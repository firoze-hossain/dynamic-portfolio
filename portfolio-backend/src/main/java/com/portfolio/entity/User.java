package com.portfolio.entity;

import com.portfolio.entity.userDataEntity.Education;
import com.portfolio.entity.userDataEntity.WorkExperience;

import lombok.Data;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "email cannot be null")
    @Email(message = "email format not valid")
    private String email;

    @NotNull(message = "username cannot be null")
    @Size(min = 3, message = "wrong username size")
    @Column(unique = true, nullable = false)
    private String username;

    @NotNull(message = "password cannot be null")
    @Size(min = 6, message = "wrong password size")
    private String password;

    private boolean admin;

    private boolean isPublic;

    private String firstName;
    private String lastName;
    @Column(length = 2048)
    private String headline;
    private Integer industry;
    private Integer gender;
    private LocalDate birthday;
    private String country;
    private String postalCode;
    private String address;
    @Column(length = 2048)
    private String profilePhoto;
    private String phoneNumber;
    @Column(length = 2048)
    private String summary;
    private Integer workingYear;
    private Integer highestEducation;

    @OneToOne
    private WorkExperience currentPosition;
    @OneToOne
    private Education currentEducation;

}
