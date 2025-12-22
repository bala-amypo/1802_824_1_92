package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String role;

    public User() {}

    public Long getId() { return id; }
    public String getEmail() { return email; }
    public String getRole() { return role; }

    public void setEmail(String email) { this.email = email; }
    public void setRole(String role) { this.role = role; }
}
