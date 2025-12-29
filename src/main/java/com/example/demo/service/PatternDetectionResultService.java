package com.example.demo.service;

import com.example.demo.model.PatternDetectionResult;
import java.util.List;

public interface PatternDetectionResultService {

    PatternDetectionResult saveResult(PatternDetectionResult result);

    List<PatternDetectionResult> getResultsByZone(long zoneId);
}
