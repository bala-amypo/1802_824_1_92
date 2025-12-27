package com.example.demo.service.impl;

import com.example.demo.service.PatternDetectionResultService;
import org.springframework.stereotype.Service;

@Service
public class PatternDetectionResultServiceImpl implements PatternDetectionResultService {

    @Override
    public String getResults() {
        return "Pattern detection results";
    }

    @Override
    public String getById(Long id) {
        return "Pattern detection result for id " + id;
    }
}
