package com.portfolio.dto.userDataDTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.portfolio.dto.DTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = false)
public class PublicationDTO extends DTO {
    private Long id;
    private String title;
    private String publicationPublisher;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate publicationDate;
    private String publicationURL;
    private String description;
    private String media;
}
