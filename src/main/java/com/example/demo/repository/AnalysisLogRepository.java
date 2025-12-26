package com.example.demo.repository;

import com.example.demo.model.AnalysisLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalysisLogRepository extends JpaRepository<AnalysisLog, Long> {
}
