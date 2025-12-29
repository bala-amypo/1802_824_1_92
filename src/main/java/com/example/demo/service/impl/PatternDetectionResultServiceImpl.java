package com.example.demo.service.impl;

import com.example.demo.model.PatternDetectionResult;
import com.example.demo.model.CrimeReport;
import com.example.demo.service.PatternDetectionResultService;

import java.util.ArrayList;
import java.util.List;

public class PatternDetectionResultServiceImpl implements PatternDetectionResultService {

    private final List<PatternDetectionResult> store = new ArrayList<>();

    @Override
    public PatternDetectionResult detectPattern(List<CrimeReport> reports) {
        PatternDetectionResult result = new PatternDetectionResult();
        result.setCrimeCount(reports.size());
        result.setDetectedPattern("HIGH_ACTIVITY");

        store.add(result);
        return result;
    }

    @Override
    public List<PatternDetectionResult> getAllResults() {
        return store;
    }

    @Override
    public PatternDetectionResult getResultById(Long id) {
        if (id == null || id < 0 || id >= store.size()) {
            return null;
        }
        return store.get(id.intValue());
    }
}
