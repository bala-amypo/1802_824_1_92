package com.example.demo.service.impl;

import com.example.demo.model.PatternDetectionResult;
import com.example.demo.repository.PatternDetectionResultRepository;
import com.example.demo.service.PatternDetectionResultService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatternDetectionResultServiceImpl
        implements PatternDetectionResultService {

    private final PatternDetectionResultRepository repo;

    public PatternDetectionResultServiceImpl(
            PatternDetectionResultRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<PatternDetectionResult> getResults() {
        return repo.findAll();
    }

    @Override
    public PatternDetectionResult getById(Long id) {
        return repo.findById(id).orElse(null);
    }
}
