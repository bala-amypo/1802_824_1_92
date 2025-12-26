package com.example.demo.service;

import com.example.demo.model.AnalysisLog;

import java.util.List;
import java.util.Optional;

public interface AnalysisLogService {

    AnalysisLog save(AnalysisLog analysisLog);

    List<AnalysisLog> findAll();

    Optional<AnalysisLog> findById(Long id);

    void deleteById(Long id);
}
