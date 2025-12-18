package com.example.demo.model;

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
}