package com.example.demo.service;

import com.example.demo.model.CrimeReport;
import com.example.demo.repository.CrimeReportRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CrimeReportService {

    private final CrimeReportRepository repository;

    public CrimeReportService(CrimeReportRepository repository) {
        this.repository = repository;
    }

    public CrimeReport createCrime(CrimeReport crimeReport) {
        return repository.save(crimeReport);
    }

    public Optional<CrimeReport> getCrimeById(Long id) {
        return repository.findById(id);
    }
}
