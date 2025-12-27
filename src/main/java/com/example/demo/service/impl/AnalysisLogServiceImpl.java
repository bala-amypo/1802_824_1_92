package com.example.demo.service.impl;

import com.example.demo.model.AnalysisLog;
import com.example.demo.service.AnalysisLogService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnalysisLogServiceImpl implements AnalysisLogService {

    private final List<AnalysisLog> logs = new ArrayList<>();

    @Override
    public List<AnalysisLog> getAllLogs() {
        return logs;
    }

    @Override
    public AnalysisLog getLogById(Long id) {
        return logs.stream()
                .filter(log -> log.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public AnalysisLog saveLog(AnalysisLog log) {
        logs.add(log);
        return log;
    }
}
