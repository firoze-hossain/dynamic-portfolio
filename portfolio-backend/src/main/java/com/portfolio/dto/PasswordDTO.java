package com.portfolio.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class PasswordDTO extends DTO {
    private String currentPassword;
    private String newPassword;
}
