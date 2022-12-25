package com.portfolio.dto.userDataDTO;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.portfolio.dto.DTO;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = false)
public class EducationDTO extends DTO {
    private Long id;
    private String schoolName;
    private String degree;
    private String fieldOfStudy;
    private String grade;
    @JsonProperty("isDefault")
    private boolean isDefault;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate startYear;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate endYear;
    private String activityAndSociety;
    private String description;
    private String media;

}
