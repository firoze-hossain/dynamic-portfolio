package com.portfolio.dto.userDataDTO;

import com.portfolio.dto.DTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class RecommendationDTO extends DTO {
    private Long id;
    private String referrerName;
    private String referrerTitle;
    private String description;
    private String media;
}
