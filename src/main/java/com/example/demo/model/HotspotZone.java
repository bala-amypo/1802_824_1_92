package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HotspotZone {

    @Id
    private Long Id;
    private String name;
    @Column(unique=true)
    private String severityLevel;
    private String zoneName;
    private Double centerLat;
    private Double centerlog;

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

    public String getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public Double getCenterLat() {
        return centerLat;
    }

    public void setCenterLat(Double centerLat) {
        this.centerLat = centerLat;
    }

    public Double getCenterlog() {
        return centerlog;
    }

    public void setCenterlog(Double centerlog) {
        this.centerlog = centerlog;
    }

    public HotspotZone(Long id, String name, String severityLevel, String zoneName, Double centerLat,
            Double centerlog) {
        Id = id;
        this.name = name;
        this.severityLevel = severityLevel;
        this.zoneName = zoneName;
        this.centerLat = centerLat;
        this.centerlog = centerlog;
    }
    
}