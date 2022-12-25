package com.portfolio.entity.userDataEntity;


import com.portfolio.entity.GenericUserData;
import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class HonourAward extends GenericUserData {
    private String title;
    private String associatedWith;
    private String issuer;
    private LocalDate issueDate;
    @Column(length = 2048)
    private String description;
    @Column(length = 2048)
    private String media;
}
