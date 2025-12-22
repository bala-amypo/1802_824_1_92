package com.example.demo.repository;

import com.example.demo.model.PatternDetectionResult;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatternDetectionResultRepository
        extends JpaRepository<PatternDetectionResult, Long> {

    // Fetch results for a specific hotspot zone
    List<PatternDetectionResult> findByZone_Id(Long zoneId);
}
