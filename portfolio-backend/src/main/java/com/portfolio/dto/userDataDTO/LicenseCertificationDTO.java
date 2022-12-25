package com.portfolio.dto.userDataDTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.portfolio.dto.DTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = false)
public class LicenseCertificationDTO extends DTO {
    private Long id;
    private String name;
    private String issuingOrganization;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate issueDate;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate expirationDate;
    private String credentialID;
    private String credentialURL;
    private String media;
}
