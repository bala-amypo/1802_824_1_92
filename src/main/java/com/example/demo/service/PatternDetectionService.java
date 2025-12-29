package com.example.demo.service;

import com.example.demo.model.PatternDetectionResult;
import java.util.List;

public interface PatternDetectionResultService {

    List<PatternDetectionResult> getResults();

    PatternDetectionResult getById(Long id);
}
