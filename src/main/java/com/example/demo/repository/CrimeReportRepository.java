package com.example.demo.repository;

import com.example.demo.model.CrimeReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrimeReportRepository extends JpaRepository<CrimeReport, Long> {
    // JpaRepository provides save(), findAll(), findById(), delete(), etc.
}
