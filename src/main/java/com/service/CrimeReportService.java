package com.example.demo.service;

import com.example.demo.model.CrimeReport;
import java.util.List;

public interface CrimeReportService {

    // Add a new crime report
    CrimeReport saveReport(CrimeReport report);

    // Fetch all crime reports
    List<CrimeReport> getAllReports();
}
