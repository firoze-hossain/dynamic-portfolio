package com.portfolio.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class AboutDTO extends DTO {
    private String summary;
}
