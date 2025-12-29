package com.example.demo.repository;

import com.example.demo.model.AnalysisLog;
import java.util.List;
import java.util.Optional;

public interface AnalysisLogRepository {

    AnalysisLog save(AnalysisLog log);

    List<AnalysisLog> findAll();

    List<AnalysisLog> findByZone_Id(long id);

    Optional<AnalysisLog> findById(Long id);
}
