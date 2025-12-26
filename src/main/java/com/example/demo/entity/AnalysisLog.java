package com.example.demo.model;

import java.time.LocalDateTime;

public class AnalysisLog {
    private String message;
    private LocalDateTime loggedAt = LocalDateTime.now();
    private HotspotZone zone;

    public String getMessage(){ return message; }
    public void setMessage(String m){ message=m; }

    public LocalDateTime getLoggedAt(){ return loggedAt; }

    public HotspotZone getZone(){ return zone; }
    public void setZone(HotspotZone z){ zone=z; }
}
