package com.portfolio.dto.userDataDTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.portfolio.dto.DTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = false)
public class WorkExperienceDTO extends DTO {
    private Long id;
    private String title;
    private String employmentType;
    private String companyName;
    private String location;
    private String industry;
    @JsonProperty("isCurrentWork")
    private boolean isDefault;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate startDate;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate endDate;
    private String description;
    private String media;
}
