package com.example.demo.service.impl;

import com.example.demo.model.PatternDetectionResult;
import com.example.demo.service.PatternDetectionResultService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatternDetectionResultServiceImpl implements PatternDetectionResultService {

    private final List<PatternDetectionResult> results = new ArrayList<>();

    @Override
    public PatternDetectionResult save(PatternDetectionResult result) {
        results.add(result);
        return result;
    }

    @Override
    public List<PatternDetectionResult> getAllResults() {
        return results;
    }

    @Override
    public PatternDetectionResult getResultById(Long id) {
        return results.stream()
                .filter(r -> r.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
