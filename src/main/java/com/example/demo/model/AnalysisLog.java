package com.example.demo.model;

public class AnalysisLog {

    private String id;
    private String message;

    public AnalysisLog() {
    }

    public AnalysisLog(String id, String message) {
        this.id = id;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
