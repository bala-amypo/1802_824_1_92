package com.example.demo.service;
import jakarta.persistence.service;
import com.example.demo.model.PatternDetection;
@Service
public interface PatternDetectionService{

    public PatternDetection PatternDetectionResult detectPattern(Long zoneld);
    public PatternDetection List<PatternDetectionResult> getResultsByZone(Long zoneld);
    }