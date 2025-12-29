package com.example.demo.controllers;

import com.example.demo.model.AnalysisLog;
import com.example.demo.service.AnalysisLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/analysis-logs")
public class AnalysisLogController {

    private final AnalysisLogService service;

    public AnalysisLogController(AnalysisLogService service) {
        this.service = service;
    }

    @GetMapping
    public List<AnalysisLog> getAllLogs() {
        return service.getLogs();
    }

    @GetMapping("/zone/{zoneId}")
    public List<AnalysisLog> getLogsByZone(@PathVariable Long zoneId) {
        return service.getLogsByZone(zoneId);
    }

    @GetMapping("/{id}")
    public AnalysisLog getLogById(@PathVariable Long id) {
        return service.getLogById(id);
    }
}
