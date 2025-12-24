package com.example.demo.controller;

import com.example.demo.entity.CrimeReport;
import com.example.demo.service.CrimeReportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/crimes")
public class CrimeReportController {

    private final CrimeReportService service;

    public CrimeReportController(CrimeReportService service) {
        this.service = service;
    }

    @PostMapping
    public CrimeReport createCrime(@RequestBody CrimeReport crimeReport) {
        return service.createCrime(crimeReport);
    }

    @GetMapping
    public List<CrimeReport> getAllCrimes() {
        return service.getAllCrimes();
    }

    @GetMapping("/{id}")
    public CrimeReport getCrimeById(@PathVariable Long id) {
        return service.getCrimeById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCrime(@PathVariable Long id) {
        service.deleteCrime(id);
    }
}