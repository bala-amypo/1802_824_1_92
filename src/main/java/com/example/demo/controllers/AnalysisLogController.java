package com.example.demo.controller;

import com.example.demo.service.AnalysisLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/analysis-logs")
public class AnalysisLogController {

    @Autowired
    private AnalysisLogService service;

    @GetMapping("/{id}")
    public String getById(@PathVariable Long id) {
        return service.getById(id);
    }
}
