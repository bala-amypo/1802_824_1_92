package com.example.demo.service;

import com.example.demo.model.AnalysisLog;

import java.util.Optional;

public interface AnalysisLogService {

    Optional<AnalysisLog> getById(Long id);
}
