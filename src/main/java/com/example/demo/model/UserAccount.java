package com.example.demo.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @OneToOne
    private User user;

    private LocalDate dateSubscription;
    private LocalDate dateBirthday;

}
