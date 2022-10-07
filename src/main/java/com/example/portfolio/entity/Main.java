package com.example.portfolio.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Main {

    @Id
    private Integer num;

    @Column
    private String id;

    @Column
    private String password;

    public Main() {

    }
}
