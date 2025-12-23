package com.example.demo.controller;

import com.example.demo.entity.AnalysisLog;
import com.example.demo.service.AnalysisLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/analysis-logs")
public class AnalysisLogController {

    private final AnalysisLogService service;

    public AnalysisLogController(
            AnalysisLogService service) {
        this.service = service;
    }

    @PostMapping
    public AnalysisLog create(
            @RequestBody AnalysisLog log) {
        return service.save(log);
    }

    @GetMapping
    public List<AnalysisLog> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public AnalysisLog getById(
            @PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(
            @PathVariable Long id) {
        service.deleteById(id);
    }
}