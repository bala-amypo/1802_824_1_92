package com.example.demo.service.impl;

import java.util.List;
import com.example.demo.model.CrimeReport;
import com.example.demo.repository.CrimeReportRepository;
import com.example.demo.service.CrimeReportService;

public class CrimeReportServiceImpl implements CrimeReportService {

    private final CrimeReportRepository repo;

    public CrimeReportServiceImpl(CrimeReportRepository repo) {
        this.repo = repo;
    }

    public CrimeReport addReport(CrimeReport r) {
        if (r.getLatitude() == null || r.getLatitude() > 90 || r.getLatitude() < -90)
            throw new RuntimeException("latitude");
        if (r.getLongitude() == null || r.getLongitude() > 180 || r.getLongitude() < -180)
            throw new RuntimeException("longitude");

        return repo.save(r);
    }

    public List<CrimeReport> getAllReports() {
        return repo.findAll();
    }
}
