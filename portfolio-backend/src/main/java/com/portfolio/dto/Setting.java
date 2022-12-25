package com.portfolio.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Setting extends DTO {
    @JsonProperty("isPublic")
    private boolean isPublic;
}
