package com.example.demo.service.impl;

import com.example.demo.service.AnalysisLogService;
import org.springframework.stereotype.Service;

@Service
public class AnalysisLogServiceImpl implements AnalysisLogService {

    @Override
    public String getLog() {
        return "Analysis log retrieved successfully";
    }
}
