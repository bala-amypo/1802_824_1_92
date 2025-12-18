package com.example.demo.model;

import java.time.LocalDatetime;
import jakarta.persistence.column;
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

}