package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "analysis_logs")
public class AnalysisLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;

    private Long zoneId;

    public AnalysisLog() {
    }

    public AnalysisLog(String message, Long zoneId) {
        this.message = message;
        this.zoneId = zoneId;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Long getZoneId() {
        return zoneId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setZoneId(Long zoneId) {
        this.zoneId = zoneId;
    }
}
