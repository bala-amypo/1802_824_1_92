package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pattern_detection_results")
public class PatternDetectionResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long zoneId;

    private String patternType;

    public PatternDetectionResult() {}

    public PatternDetectionResult(Long id, Long zoneId, String patternType) {
        this.id = id;
        this.zoneId = zoneId;
        this.patternType = patternType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getZoneId() {
        return zoneId;
    }

    public void setZoneId(Long zoneId) {
        this.zoneId = zoneId;
    }

    public String getPatternType() {
        return patternType;
    }

    public void setPatternType(String patternType) {
        this.patternType = patternType;
    }
}
