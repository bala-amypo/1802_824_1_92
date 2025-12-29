package com.example.demo.controllers;

import com.example.demo.model.AnalysisLog;
import com.example.demo.service.AnalysisLogService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/logs")
@Tag(name = "Analysis Log Controller", description = "Analysis log APIs")
public class AnalysisLogController {

    private final AnalysisLogService service;

    public AnalysisLogController(AnalysisLogService service) {
        this.service = service;
    }

    @Operation(summary = "Get all analysis logs")
    @GetMapping
    public List<AnalysisLog> getLogs() {
        return service.getLogs();
    }

    @Operation(summary = "Get logs by zone ID")
    @GetMapping("/zone/{zoneId}")
    public List<AnalysisLog> getLogsByZone(@PathVariable Long zoneId) {
        return service.getLogsByZone(zoneId);
    }

    @Operation(summary = "Get log by ID")
    @GetMapping("/{id}")
    public AnalysisLog getLogById(@PathVariable Long id) {
        return service.getLogById(id);
    }
}
