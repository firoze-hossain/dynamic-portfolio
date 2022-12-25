package com.portfolio.dto.userDataDTO;


import com.portfolio.dto.DTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class FeatureDTO extends DTO {
    private Long id;
    private String title;
    private String link;
    private String media;
}
