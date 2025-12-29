package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class AnalysisLog {

    @Id
    @GeneratedValue
    private Long id;

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
