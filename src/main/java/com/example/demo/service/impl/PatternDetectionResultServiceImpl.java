package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.PatternDetectionResultService;

@Service
public class PatternDetectionResultServiceImpl implements PatternDetectionResultService {

    @Override
    public String getResults() {
        return "Pattern detection results";
    }
}
