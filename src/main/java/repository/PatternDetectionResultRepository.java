package com.example.demo.repository;

import com.example.demo.entity.PatternDetectionResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatternDetectionResultRepository
        extends JpaRepository<PatternDetectionResult, Long> {
}