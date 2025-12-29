package com.example.demo.service.impl;

import com.example.demo.model.PatternDetectionResult;
import com.example.demo.service.PatternDetectionService;
import org.springframework.stereotype.Service;

@Service
public class PatternDetectionServiceImpl implements PatternDetectionService {

    @Override
    public PatternDetectionResult detectPattern(PatternDetectionResult result) {
        return result;
    }
}
