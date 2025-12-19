package com.example.demo.controllers;

import com.example.demo.model.AnalysisLog;
import com.example.demo.service.AnalysisLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/logs")
public class AnalysisLogController {

    private final AnalysisLogService analysisLogService;

    public AnalysisLogController(AnalysisLogService analysisLogService) {
        this.analysisLogService = analysisLogService;
    }

    @PostMapping("/{zoneId}")
    public AnalysisLog addLog(@PathVariable Long zoneId,
                              @RequestParam String message) {
        return analysisLogService.addLog(zoneId, message);
    }

    @GetMapping("/{zoneId}")
    public List<AnalysisLog> getLogs(@PathVariable Long zoneId) {
        return analysisLogService.getLogsByZone(zoneId);
    }
}
