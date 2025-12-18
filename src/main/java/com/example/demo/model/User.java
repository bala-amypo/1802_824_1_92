package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import java.time.LocalDateTime;

@Entity
public class User {
    
    @Id
    private Long id;
    private String name;
    @Column(unique=true)
    private String email;
    private String password;
    private String role;
    private LocalDateTime createdAt;

    public void ValidateAndInitializer() {
        this.createdAt = LocalDateTime.now(); 
    }
}