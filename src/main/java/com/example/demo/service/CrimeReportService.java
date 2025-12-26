package com.example.demo.service;

import com.example.demo.model.CrimeReport;

import java.util.Optional;

public interface CrimeReportService {

    CrimeReport createCrime(CrimeReport crimeReport);

    Optional<CrimeReport> getById(Long id);
}
