package com.example.demo.model;

import java.time.LocalDateTime;

public class AnalysisLog {

    private LocalDateTime loggedAt = LocalDateTime.now();

    public LocalDateTime getLoggedAt() {
        return loggedAt;
    }
}
