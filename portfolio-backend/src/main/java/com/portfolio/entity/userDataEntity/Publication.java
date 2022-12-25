package com.portfolio.entity.userDataEntity;

import com.portfolio.entity.GenericUserData;
import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Publication extends GenericUserData {
    private String title;
    private String publicationPublisher;
    private LocalDate publicationDate;
    private String publicationURL;
    @Column(length = 2048)
    private String description;
    @Column(length = 2048)
    private String media;
}
