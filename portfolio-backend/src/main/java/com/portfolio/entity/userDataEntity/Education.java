package com.portfolio.entity.userDataEntity;

import com.portfolio.entity.GenericUserData;
import com.portfolio.entity.User;
import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Education extends GenericUserData {
    private String schoolName;
    private String degree;
    private String fieldOfStudy;
    private String grade;
    private LocalDate startYear;
    private LocalDate endYear;
    @Column(length = 2048)
    private String activityAndSociety;
    @Column(length = 2048)
    private String description;
    @Column(length = 2048)
    private String media;

    @OneToOne(mappedBy = "currentEducation")
    private User flagCurrentEducation;
}
