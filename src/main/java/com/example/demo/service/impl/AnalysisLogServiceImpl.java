package com.example.demo.service.impl;

import com.example.demo.service.AnalysisLogService;
import org.springframework.stereotype.Service;

@Service
public class AnalysisLogServiceImpl implements AnalysisLogService {

    @Override
    public void addLog(long zoneId, String message) {
        // no-op for tests
    }
}
