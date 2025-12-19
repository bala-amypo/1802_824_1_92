package com.example.demo.;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PatternDetectionResult {

    @Id
    private Long Id;
    private String name;
    @Column(unique=true)
    private String detectedPattern;
    private String zone;
    private int crimeCount;
    private LocalDateTime createdAt;

    public PatternDetectionResult(Long Id, LocalDateTime createdAt, int crimeCount, String detectedPattern, String name, String zone) {
        this.Id = Id;
        this.createdAt = createdAt;
        this.crimeCount = crimeCount;
        this.detectedPattern = detectedPattern;
        this.name = name;
        this.zone = zone;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetectedPattern() {
        return detectedPattern;
    }

    public void setDetectedPattern(String detectedPattern) {
        this.detectedPattern = detectedPattern;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public int getCrimeCount() {
        return crimeCount;
    }

    public void setCrimeCount(int crimeCount) {
        this.crimeCount = crimeCount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }


    
}