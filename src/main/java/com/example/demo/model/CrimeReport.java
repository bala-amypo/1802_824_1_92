package com.example.demo.model;

import java.time.LocalDateTime;

public class CrimeReport {
    private String crimeType;
    private String description;
    private Double latitude;
    private Double longitude;
    private LocalDateTime occurredAt;

    public String getCrimeType(){ return crimeType; }
    public void setCrimeType(String c){ crimeType=c; }

    public Double getLatitude(){ return latitude; }
    public void setLatitude(Double l){ latitude=l; }

    public Double getLongitude(){ return longitude; }
    public void setLongitude(Double l){ longitude=l; }

    public LocalDateTime getOccurredAt(){ return occurredAt; }
    public void setOccurredAt(LocalDateTime t){ occurredAt=t; }

    public String getDescription(){ return description; }
    public void setDescription(String d){ description=d; }
}
