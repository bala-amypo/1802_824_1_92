package com.example.demo.entity;

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
        this.crimeType = crimeType;
        this.location = location;
        this.severity = severity;
        this.description = description;
    }

    /* ---------------- GETTERS & SETTERS ---------------- */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCrimeType() {
        return crimeType;
    }

    public void setCrimeType(String crimeType) {
        this.crimeType = crimeType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}