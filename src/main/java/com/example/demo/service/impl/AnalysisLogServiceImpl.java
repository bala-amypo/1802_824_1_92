package com.example.demo.service.impl;

import com.example.demo.model.AnalysisLog;
import com.example.demo.repository.AnalysisLogRepository;
import com.example.demo.service.AnalysisLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnalysisLogServiceImpl implements AnalysisLogService {

    private final AnalysisLogRepository repo;

    public AnalysisLogServiceImpl(AnalysisLogRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<AnalysisLog> getLogs() {
        return repo.findAll();
    }

    @Override
    public List<AnalysisLog> getLogsByZone(Long zoneId) {
        return repo.findByZoneId(zoneId);
    }

    @Override
    public AnalysisLog getLogById(Long id) {
        return repo.findById(id).orElse(null);
    }
}
