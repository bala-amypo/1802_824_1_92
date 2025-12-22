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
