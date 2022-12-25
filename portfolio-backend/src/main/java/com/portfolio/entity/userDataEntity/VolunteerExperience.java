package com.portfolio.entity.userDataEntity;


import com.portfolio.entity.GenericUserData;
import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.time.LocalDate;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class VolunteerExperience extends GenericUserData {
    private String organizationName;
    private String role;
    private String cause;
    private LocalDate startDate;
    private LocalDate endDate;
    @Column(length = 2048)
    private String description;
    @Column(length = 2048)
    private String media;
}
