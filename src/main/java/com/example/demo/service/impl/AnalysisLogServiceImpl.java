package com.example.demo.service.impl;

import com.example.demo.model.AnalysisLog;
import com.example.demo.repository.AnalysisLogRepository;
import com.example.demo.service.AnalysisLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnalysisLogServiceImpl implements AnalysisLogService {

    @Autowired
    private AnalysisLogRepository repository;

    @Override
    public List<AnalysisLog> getLogs() {
        return repository.findAll();
    }

    @Override
    public List<AnalysisLog> getLogsByZone(Long zoneId) {
        return repository.findByZoneId(zoneId);
    }

    @Override
    public Optional<AnalysisLog> getLogById(Long id) {
        return repository.findById(id);
    }
}
