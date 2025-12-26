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
    public AnalysisLog save(AnalysisLog log) {
        return repo.save(log);
    }

    @Override
    public List<AnalysisLog> getAll() {
        return repo.findAll();
    }
}
