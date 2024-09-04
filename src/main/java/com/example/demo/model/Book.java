package com.example.demo.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @ManyToOne
    private Author author;

    private String title;
    private String content;
    private Integer nbrPages;
    private LocalDate datePulication;
    private String editor;
    private boolean newBook;
    private boolean disponibility;
    private String language;


}
