package com.example.demo.service.impl;

import com.example.demo.model.PatternDetectionResult;
import com.example.demo.repository.PatternDetectionResultRepository;
import com.example.demo.service.PatternDetectionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatternDetectionResultServiceImpl
        implements PatternDetectionService {

    private final PatternDetectionResultRepository repository;

    public PatternDetectionResultServiceImpl(
            PatternDetectionResultRepository repository) {
        this.repository = repository;
    }

    @Override
    public PatternDetectionResult saveResult(
            PatternDetectionResult result) {
        return repository.save(result);
    }

    @Override
    public List<PatternDetectionResult> getAllResults() {
        return repository.findAll();
    }
}
