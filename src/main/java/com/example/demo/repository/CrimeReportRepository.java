package com.example.demo.repository;

import com.example.demo.model.CrimeReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CrimeReportRepository extends JpaRepository<CrimeReport, Long> {

    // Find crimes by zone
    List<CrimeReport> findByZone(String zone);

    // Find crimes by type
    List<CrimeReport> findByCrimeType(String crimeType);

    // Find crimes by status
    List<CrimeReport> findByStatus(String status);
}
