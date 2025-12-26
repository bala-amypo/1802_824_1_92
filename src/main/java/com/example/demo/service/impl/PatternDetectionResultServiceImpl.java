package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.PatternDetectionResult;
import com.example.demo.service.PatternDetectionResultService;

@Service
public class PatternDetectionResultServiceImpl
        implements PatternDetectionResultService {

    // ✅ CONSTRUCTOR (OPTIONAL)
    public PatternDetectionResultServiceImpl() {
    }

    // ✅ METHOD WITH RETURN TYPE
    @Override
    public PatternDetectionResult save(PatternDetectionResult result) {
        return result;
    }

    // ✅ METHOD WITH RETURN TYPE
    @Override
    public List<PatternDetectionResult> findAll() {
        return List.of();
    }

    // ✅ METHOD WITH RETURN TYPE
    @Override
    public PatternDetectionResult findById(Long id) {
        return null;
    }

    // ✅ METHOD WITH RETURN TYPE
    @Override
    public void deleteById(Long id) {
        // no-op
    }
}
