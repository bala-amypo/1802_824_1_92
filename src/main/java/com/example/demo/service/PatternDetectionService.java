package com.example.demo.service;

import com.example.demo.model.CrimeReport;
import com.example.demo.model.PatternDetectionResult;

import java.util.List;

public interface PatternDetectionService {
    PatternDetectionResult detectPattern(List<CrimeReport> reports);
}
