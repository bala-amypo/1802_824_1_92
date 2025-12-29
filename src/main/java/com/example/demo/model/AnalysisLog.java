package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class AnalysisLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long zoneId;
    private String message;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getZoneId() { return zoneId; }
    public void setZoneId(Long zoneId) { this.zoneId = zoneId; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
