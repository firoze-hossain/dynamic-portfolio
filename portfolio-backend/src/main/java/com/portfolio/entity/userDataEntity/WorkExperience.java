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
public class WorkExperience extends GenericUserData {
    private String title;
    private String employmentType;
    private String companyName;
    private String location;
    private String industry;
    private LocalDate startDate;
    private LocalDate endDate;
    @Column(length = 2048)
    private String description;
    @Column(length = 2048)
    private String media;

    @OneToOne(mappedBy = "currentPosition")
    private User flagCurrentPosition;
}
