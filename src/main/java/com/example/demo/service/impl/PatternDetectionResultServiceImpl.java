package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.PatternDetectionResult;
import com.example.demo.service.PatternDetectionResultService;

@Service
public class PatternDetectionResultServiceImpl
        implements PatternDetectionResultService {

    // ✅ Constructor (name matches class)
    public PatternDetectionResultServiceImpl() {
    }

    // ✅ Return type PRESENT
    @Override
    public PatternDetectionResult save(PatternDetectionResult result) {
        return result;
    }

    // ✅ Return type PRESENT
    @Override
    public List<PatternDetectionResult> findAll() {
        return List.of();
    }

    // ✅ Return type PRESENT
    @Override
    public PatternDetectionResult findById(Long id) {
        return null;
    }

    // ✅ void return type
    @Override
    public void deleteById(Long id) {
        // no operation
    }
}
