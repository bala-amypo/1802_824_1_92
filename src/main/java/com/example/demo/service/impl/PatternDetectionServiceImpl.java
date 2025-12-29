package com.example.demo.service.impl;

import com.example.demo.model.PatternDetection;
import com.example.demo.repository.PatternDetectionRepository;
import com.example.demo.service.PatternDetectionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatternDetectionResultServiceImpl implements PatternDetectionService {

    private final PatternDetectionRepository repository;

    public PatternDetectionServiceImpl(PatternDetectionRepository repository) {
        this.repository = repository;
    }

    @Override
    public PatternDetection save(PatternDetection) {
        return repository.save(result);
    }

    @Override
    public List<PatternDetectionResult> getAllResults() {
        return repository.findAll();
    }

    @Override
    public PatternDetectionResult getResultById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
