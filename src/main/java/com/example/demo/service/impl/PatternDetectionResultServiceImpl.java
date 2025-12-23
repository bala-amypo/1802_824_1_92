package com.example.demo.service.impl;

import com.example.demo.entity.PatternDetectionResult;
import com.example.demo.repository.PatternDetectionResultRepository;
import com.example.demo.service.PatternDetectionResultService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatternDetectionResultServiceImpl
        implements PatternDetectionResultService {

    private final PatternDetectionResultRepository repository;

    public PatternDetectionResultServiceImpl(
            PatternDetectionResultRepository repository) {
        this.repository = repository;
    }

    @Override
    public PatternDetectionResult save(PatternDetectionResult result) {
        return repository.save(result);
    }

    @Override
    public List<PatternDetectionResult> findAll() {
        return repository.findAll();
    }

    @Override
    public PatternDetectionResult findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
