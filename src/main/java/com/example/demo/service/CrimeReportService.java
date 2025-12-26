package com.example.demo.service;

import com.example.demo.model.CrimeReport;

import java.util.List;
import java.util.Optional;

public interface CrimeReportService {

    CrimeReport saveCrime(CrimeReport crimeReport);

    List<CrimeReport> getAllCrimes();

    Optional<CrimeReport> getCrimeById(Long id);

    void deleteCrime(Long id);
}
