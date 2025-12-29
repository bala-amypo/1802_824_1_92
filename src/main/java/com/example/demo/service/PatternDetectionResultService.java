package com.example.demo.service;

import com.example.demo.model.PatternDetectionResult;
import com.example.demo.model.CrimeReport;

import java.util.List;

public interface PatternDetectionResultService {

    // existing
    PatternDetectionResult detectPattern(List<CrimeReport> reports);

    // required by controller
    List<PatternDetectionResult> getAllResults();

    PatternDetectionResult getResultById(Long id);
}
