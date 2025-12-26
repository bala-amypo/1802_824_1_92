package com.example.demo.service;

import com.example.demo.model.PatternDetectionResult;

import java.util.List;
import java.util.Optional;

public interface PatternDetectionResultService {

    PatternDetectionResult save(PatternDetectionResult result);

    List<PatternDetectionResult> findAll();

    Optional<PatternDetectionResult> findById(Long id);

    void deleteById(Long id);
}
