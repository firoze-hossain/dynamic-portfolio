package com.portfolio.entity;

import javax.persistence.*;
import lombok.Data;



@Data
@MappedSuperclass
public abstract class GenericUserData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;
}
