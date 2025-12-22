package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pattern_detection_results")
public class PatternDetectionResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String patternType;
    private String description;

    // No-Args Constructor
    public PatternDetectionResult() {
    }

    // All-Args Constructor
    public PatternDetectionResult(Long id, String patternType, String description) {
        this.id = id;
        this.patternType = patternType;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getPatternType() {
        return patternType;
    }

    public void setPatternType(String patternType) {
        this.patternType = patternType;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}