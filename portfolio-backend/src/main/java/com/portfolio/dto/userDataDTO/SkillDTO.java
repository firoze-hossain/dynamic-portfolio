package com.portfolio.dto.userDataDTO;

import com.portfolio.dto.DTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class SkillDTO extends DTO {
    private Long id;
    private String skillName;
}
