package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private String lastName;
    private String firstName;
    private String biography;

    @OneToMany
    private Book book;
}
