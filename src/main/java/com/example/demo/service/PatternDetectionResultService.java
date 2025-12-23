package com.example.demo.service;

import com.example.demo.entity.PatternDetectionResult;
import java.util.List;

public interface PatternDetectionResultService {

    PatternDetectionResult save(PatternDetectionResult result);

    List<PatternDetectionResult> findAll();

    PatternDetectionResult findById(Long id);

    void deleteById(Long id);
}