package com.example.crud.sample.crud_repository_sample.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "basic_form_detail")
@Data
public class BasicFormDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private int age;
}
