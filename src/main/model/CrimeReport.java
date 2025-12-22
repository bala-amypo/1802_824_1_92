[3:39 pm, 22/12/2025] Srivimal Skct: package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "crime_reports")
public class CrimeReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String crimeType;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String severity;

    private String description;

    /* ---------------- CONSTRUCTORS ---------------- */

    // No-Args Constructor
    public CrimeReport() {
    }

    // All-Args Constructor
    public CrimeReport(Long id, String crimeType, String location,
                       String severity, String description) {
        this.id = id;
  …
[3:40 pm, 22/12/2025] Srivimal Skct: 🔹 1️⃣ USER MODULE
📌 Entity – User.java
package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String role;

    public User() {
    }

    public User(Long id, String name, String email, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}