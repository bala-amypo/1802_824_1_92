package com.example.demo.service.impl;

import com.example.demo.model.AnalysisLog;
import com.example.demo.repository.AnalysisLogRepository;
import com.example.demo.service.AnalysisLogService;

import java.util.List;

public class AnalysisLogServiceImpl implements AnalysisLogService {

    private final AnalysisLogRepository repository;

    public AnalysisLogServiceImpl(AnalysisLogRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<AnalysisLog> getLogs() {
        return repository.findAll();
    }

    @Override
    public List<AnalysisLog> getLogsByZone(Long zoneId) {
        return repository.findByZone_Id(zoneId);
    }

    @Override
    public AnalysisLog getLogById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
