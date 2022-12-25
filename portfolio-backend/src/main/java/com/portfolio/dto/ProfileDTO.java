package com.portfolio.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = false)
public class ProfileDTO extends DTO {
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate birthday;
    private String phoneNumber;
}
