package com.example.demo.controllers;

import com.example.demo.model.CrimeReport;
import com.example.demo.service.CrimeReportService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/crime-reports")
@Tag(name = "Crime Report Controller", description = "Crime report APIs")
public class CrimeReportController {

    private final CrimeReportService service;

    public CrimeReportController(CrimeReportService service) {
        this.service = service;
    }

    @Operation(summary = "Add a crime report")
    @PostMapping
    public CrimeReport addReport(@RequestBody CrimeReport report) {
        return service.addReport(report);
    }

    @Operation(summary = "Get all crime reports")
    @GetMapping
    public List<CrimeReport> getAllReports() {
        return service.getAllReports();
    }
}
