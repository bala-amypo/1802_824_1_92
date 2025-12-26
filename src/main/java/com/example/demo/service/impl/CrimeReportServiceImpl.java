package com.example.demo.service.impl;

import com.example.demo.model.CrimeReport;
import com.example.demo.repository.CrimeReportRepository;
import com.example.demo.service.CrimeReportService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CrimeReportServiceImpl implements CrimeReportService {

    private final CrimeReportRepository repository;

    public CrimeReportServiceImpl(CrimeReportRepository repository) {
        this.repository = repository;
    }

    @Override
    public CrimeReport createCrime(CrimeReport crimeReport) {
        return repository.save(crimeReport);
    }

    @Override
    public Optional<CrimeReport> getById(Long id) {
        return repository.findById(id);
    }
}
