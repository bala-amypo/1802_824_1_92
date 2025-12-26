package com.example.demo.model;

import java.time.LocalDate;

public class PatternDetectionResult {
    private HotspotZone zone;
    private Integer crimeCount;
    private String detectedPattern;
    private LocalDate analysisDate;

    public HotspotZone getZone(){ return zone; }
    public void setZone(HotspotZone z){ zone=z; }

    public Integer getCrimeCount(){ return crimeCount; }
    public void setCrimeCount(Integer c){ crimeCount=c; }

    public String getDetectedPattern(){ return detectedPattern; }
    public void setDetectedPattern(String d){ detectedPattern=d; }

    public LocalDate getAnalysisDate(){ return analysisDate; }
    public void setAnalysisDate(LocalDate d){ analysisDate=d; }
}
