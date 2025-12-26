package com.example.demo.service.impl;

import com.example.demo.model.AnalysisLog;
import com.example.demo.repository.AnalysisLogRepository;
import com.example.demo.service.AnalysisLogService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnalysisLogServiceImpl implements AnalysisLogService {

    private final AnalysisLogRepository repository;

    public AnalysisLogServiceImpl(AnalysisLogRepository repository) {
        this.repository = repository;
    }

    @Override
    public AnalysisLog save(AnalysisLog analysisLog) {
        return repository.save(analysisLog);
    }

    @Override
    public List<AnalysisLog> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<AnalysisLog> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
