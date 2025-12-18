package com.example.demo.model;

import java.time.LocalDatetime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AnalysisLog {

    @Id
    private Long Id;
    private String name;
    @Column(unique=true)
    private String message;
    private String zone;
    private LocalDateTime createdAt;
    

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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public AnalysisLog(Long id, String name, String message, String zone, LocalDateTime createdAt) {
        Id = id;
        this.name = name;
        this.message = message;
        this.zone = zone;
        this.createdAt = createdAt;
    }
    
}