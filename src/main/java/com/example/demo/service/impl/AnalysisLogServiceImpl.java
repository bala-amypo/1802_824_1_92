package com.example.demo.service.impl;

import com.example.demo.model.AnalysisLog;
import com.example.demo.service.AnalysisLogService;
import org.springframework.stereotype.Service;

@Service
public class AnalysisLogServiceImpl implements AnalysisLogService {

    @Override
    public String getLog() {
        AnalysisLog log = new AnalysisLog("1", "Log created successfully");
        return log.getId();
    }
}
