package com.example.demo.service;

import com.example.demo.model.PatternDetectionResult;
import java.util.List;

public interface PatternDetectionResultService {

    PatternDetectionResult save(PatternDetectionResult result);

    List<PatternDetectionResult> getAllResults();

    PatternDetectionResult getResultById(Long id);
}
