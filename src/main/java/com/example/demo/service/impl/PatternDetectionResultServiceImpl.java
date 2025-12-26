package com.example.demo.service.impl;

import com.example.demo.service.PatternDetectionResultService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatternDetectionResultServiceImpl implements PatternDetectionResultService {

    @Override
    public List<String> detectPatterns(Long zoneId) {
        return List.of("LOW", "MEDIUM", "HIGH");
    }
}
