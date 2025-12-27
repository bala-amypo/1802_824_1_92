package com.example.demo.controllers;

import com.example.demo.model.AnalysisLog;
import com.example.demo.service.AnalysisLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/analysis-logs")
public class AnalysisLogController {

    @Autowired
    private AnalysisLogService analysisLogService;

    @GetMapping
    public ResponseEntity<List<AnalysisLog>> getAllLogs() {
        return ResponseEntity.ok(analysisLogService.getLogs());
    }

    @GetMapping("/zone/{zoneId}")
    public ResponseEntity<List<AnalysisLog>> getLogsByZone(@PathVariable Long zoneId) {
        return ResponseEntity.ok(analysisLogService.getLogsByZone(zoneId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnalysisLog> getLogById(@PathVariable Long id) {
        return analysisLogService.getLogById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
