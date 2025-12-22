package com.example.demo.controllers;

import com.example.demo.model.CrimeReport;
import com.example.demo.service.CrimeReportService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reports")
@Tag(name = "Crime Report Controller")
public class CrimeReportController {

    private final CrimeReportService crimeReportService;

    public CrimeReportController(CrimeReportService crimeReportService) {
        this.crimeReportService = crimeReportService;
    }

    @PostMapping
    public CrimeReport addReport(@RequestBody CrimeReport report) {
        return crimeReportService.saveReport(report);
    }

    @GetMapping
    public List<CrimeReport> getAllReports() {
        return crimeReportService.getAllReports();
    }
}
