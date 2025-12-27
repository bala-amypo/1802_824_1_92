package com.example.demo.controllers;

import com.example.demo.service.AnalysisLogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnalysisLogController {

    private final AnalysisLogService service;

    public AnalysisLogController(AnalysisLogService service) {
        this.service = service;
    }

    @GetMapping("/logs")
    public String getLogs() {
        return service.getLog();
    }
}
