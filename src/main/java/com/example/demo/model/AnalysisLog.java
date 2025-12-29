package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class AnalysisLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;
    private LocalDateTime loggedAt = LocalDateTime.now();

    @ManyToOne
    private HotspotZone zone;

    public LocalDateTime getLoggedAt() { return loggedAt; }

    public void setZone(HotspotZone zone) { this.zone = zone; }
    public HotspotZone getZone() { return zone; }
}
