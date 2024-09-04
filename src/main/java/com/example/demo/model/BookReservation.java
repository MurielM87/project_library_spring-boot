package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class BookReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @ManyToMany
    private Book book;
    @OneToOne
    private UserAccount userAccount;

}
