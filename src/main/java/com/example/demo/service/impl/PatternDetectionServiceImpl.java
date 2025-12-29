package com.example.demo.service.impl;

import com.example.demo.model.CrimeReport;
import com.example.demo.model.PatternDetectionResult;
import com.example.demo.service.PatternDetectionService;

import java.util.List;

public class PatternDetectionServiceImpl implements PatternDetectionService {

    @Override
    public PatternDetectionResult detectPattern(List<CrimeReport> reports) {
        PatternDetectionResult result = new PatternDetectionResult();
        result.setCrimeCount(reports.size());
        result.setDetectedPattern("HIGH_ACTIVITY");
        return result;
    }
}
