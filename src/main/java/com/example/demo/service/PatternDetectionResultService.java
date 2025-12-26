package com.example.demo.service;

import com.example.demo.model.PatternDetectionResult;

import java.util.Optional;

public interface PatternDetectionResultService {

    Optional<PatternDetectionResult> getById(Long id);
}
