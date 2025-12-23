package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PatternDetectionResult {

    @Id
    private Long id;
    private String result;
}
