package com.portfolio.entity.userDataEntity;

import com.portfolio.entity.GenericUserData;
import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.time.LocalDate;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Project extends GenericUserData {
    private String projectName;
    private LocalDate startDate;
    private LocalDate endDate;
    private String projectURL;
    @Column(length = 2048)
    private String description;
    @Column(length = 2048)
    private String media;
}
