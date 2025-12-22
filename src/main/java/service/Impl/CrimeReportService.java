package com.example.demo.service;

import com.example.demo.entity.CrimeReport;

import java.util.List;

public interface CrimeReportService {

    CrimeReport createCrime(CrimeReport crimeReport);

    List<CrimeReport> getAllCrimes();

    CrimeReport getCrimeById(Long id);

    void deleteCrime(Long id);
}