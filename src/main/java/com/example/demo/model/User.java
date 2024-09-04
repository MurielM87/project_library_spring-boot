package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private String lastName;
    private String firstName;
    private String email;
    private String address;
    private Integer postalCode;

    @OneToOne
    private UserAccount userAccount;
}
