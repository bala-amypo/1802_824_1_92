package com.example.demo.model;

import java.time.LocalDateTime;

public class AnalysisLog {
    private Long id;
    private String message;
    private LocalDateTime loggedAt = LocalDateTime.now();
    private HotspotZone zone;

    public Long getId() { return id; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public LocalDateTime getLoggedAt() { return loggedAt; }

    public HotspotZone getZone() { return zone; }
    public void setZone(HotspotZone zone) { this.zone = zone; }
}
