package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence

@Entity
public class User {
    
    @Id
    private Long id;
    private String name;
    @Column(unique=true)
    private String email;
}