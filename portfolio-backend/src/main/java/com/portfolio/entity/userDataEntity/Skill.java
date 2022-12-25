package com.portfolio.entity.userDataEntity;

import com.portfolio.entity.GenericUserData;
import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Skill extends GenericUserData {
    private String skillName;
}
