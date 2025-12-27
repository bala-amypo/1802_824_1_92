package com.example.demo.service;

import com.example.demo.model.AnalysisLog;

import java.util.List;
import java.util.Optional;

public interface AnalysisLogService {

    List<AnalysisLog> getLogs();

    List<AnalysisLog> getLogsByZone(Long zoneId);

    Optional<AnalysisLog> getLogById(Long id);
}
