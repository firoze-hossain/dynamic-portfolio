package com.portfolio.entity.userDataEntity;

import com.portfolio.entity.GenericUserData;
import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class LicenseCertification extends GenericUserData {
    private String name;
    private String issuingOrganization;
    private LocalDate issueDate;
    private LocalDate expirationDate;
    private String credentialID;
    private String credentialURL;
    @Column(length = 2048)
    private String media;

}
