package com.example.demo.model;

public class AnalysisLog {

    private Long id;
    private String message;

    public AnalysisLog() {
    }

    public AnalysisLog(Long id, String message) {
        this.id = id;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
