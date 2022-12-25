package com.portfolio.dto.userDataDTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.portfolio.dto.DTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = false)
public class ProjectDTO extends DTO {
    private Long id;
    private String projectName;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate startDate;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate endDate;
    private String projectURL;
    private String description;
    private String media;
}
