package com.example.demo.service;

import com.example.demo.model.CrimeReport;
import java.util.List;

public interface CrimeReportService {
    CrimeReport createCrime(CrimeReport crime);
    List<CrimeReport> getAllCrimes();
    CrimeReport getCrimeById(Long id);
    void deleteCrime(Long id);
}
