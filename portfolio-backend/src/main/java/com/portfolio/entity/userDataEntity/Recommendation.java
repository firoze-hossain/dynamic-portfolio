package com.portfolio.entity.userDataEntity;

import com.portfolio.entity.GenericUserData;
import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Recommendation extends GenericUserData {
    private String referrerName;
    private String referrerTitle;
    @Column(length = 2048)
    private String description;
    @Column(length = 2048)
    private String media;
}
