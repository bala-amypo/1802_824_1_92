package com.example.demo.service;
import jakarta.persistence.service;
import com.example.demo.model.CrimeReport;
@Service
public interface CrimeReportService{

    public CrimeReport addReport(CrimeReport report);
    public CrimeReport List<CrimeReport> getAllReports();
}