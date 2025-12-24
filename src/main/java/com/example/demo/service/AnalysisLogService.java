package com.example.demo.service;

import com.example.demo.entity.AnalysisLog;

import java.util.List;

public interface AnalysisLogService {

    AnalysisLog save(AnalysisLog log);

    List<AnalysisLog> findAll();

    AnalysisLog findById(Long id);

    void deleteById(Long id);
}