package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class PatternDetectionResult {

    @Id
    @GeneratedValue
    private Long id;

    private int crimeCount;
    private String detectedPattern;
    private LocalDate analysisDate;

    @ManyToOne
    private HotspotZone zone;

    public int getCrimeCount() {
        return crimeCount;
    }

    public void setCrimeCount(int crimeCount) {
        this.crimeCount = crimeCount;
    }

    public String getDetectedPattern() {
        return detectedPattern;
    }

    public void setDetectedPattern(String detectedPattern) {
        this.detectedPattern = detectedPattern;
    }

    public HotspotZone getZone() {
        return zone;
    }

    public void setZone(HotspotZone zone) {
        this.zone = zone;
    }

    public LocalDate getAnalysisDate() {
        return analysisDate;
    }

    public void setAnalysisDate(LocalDate analysisDate) {
        this.analysisDate = analysisDate;
    }
}
