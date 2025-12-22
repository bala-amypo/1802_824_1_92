package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class PatternDetectionResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String detectedPattern;

    @ManyToOne
    private HotspotZone zone;

    public PatternDetectionResult() {}
}
