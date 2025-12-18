package com.example.demo.example;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HotSpotzone {

    @Id
    private Long Id;
    private String name;
    @Column(unique=true)
    private String severityLevel;
    private String zoneName;
    private Double centerLat;
    private Double centerlog;
    
}