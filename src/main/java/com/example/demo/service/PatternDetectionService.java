package com.example.demo.service;

import com.example.demo.model.PatternDetectionResult;

import java.util.List;

public interface PatternDetectionService {

    PatternDetectionResult saveResult(PatternDetectionResult result);

    List<PatternDetectionResult> getAllResults();
}
