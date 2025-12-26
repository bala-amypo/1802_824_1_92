package com.example.demo.service;

import java.util.List;
import com.example.demo.model.PatternDetectionResult;

public interface PatternDetectionResultService {

    PatternDetectionResult save(PatternDetectionResult result);

    List<PatternDetectionResult> findAll();

    PatternDetectionResult findById(Long id);

    void deleteById(Long id);
}
