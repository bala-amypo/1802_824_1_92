package com.example.demo.service;

import com.example.demo.model.PatternDetectionResult;
import java.util.List;

public interface PatternDetectionService {
    PatternDetectionResult analyzeZone(Long zoneId);
    List<PatternDetectionResult> getResultsByZone(Long zoneId);
}
