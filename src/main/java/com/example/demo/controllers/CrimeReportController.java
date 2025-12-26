package com.example.demo.controller;

import com.example.demo.service.CrimeReportService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/crime")
public class CrimeReportController {

    private final CrimeReportService service;

    public CrimeReportController(CrimeReportService service) {
        this.service = service;
    }

    @GetMapping
    public String getReports() {
        return service.getAllReports();
    }
}
