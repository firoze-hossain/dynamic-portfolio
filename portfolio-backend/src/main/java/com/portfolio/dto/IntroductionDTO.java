package com.portfolio.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.portfolio.dto.userDataDTO.EducationDTO;
import com.portfolio.dto.userDataDTO.WorkExperienceDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = false)
public class IntroductionDTO extends DTO {
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String headline;
    private String industry;
    private WorkExperienceDTO currentPosition;
    private EducationDTO currentEducation;
    private String gender;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate birthday;
    private String country;
    private String postalCode;
    private String address;
    private String profilePhoto;
    private String phoneNumber;
    private String email;

    private String workingYear;
    private String highestEducation;
}
