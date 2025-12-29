package com.example.demo.repository;

import com.example.demo.model.AnalysisLog;
import java.util.List;
import java.util.Optional;

public interface AnalysisLogRepository {

    AnalysisLog save(AnalysisLog log);

    List<AnalysisLog> findAll();

    List<AnalysisLog> findByZoneId(Long zoneId);

    Optional<AnalysisLog> findById(Long id);
}
