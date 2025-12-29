package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.model.PatternDetectionResult;
import com.example.demo.service.PatternDetectionResultService;

@RestController
@RequestMapping("/api/pattern-results")
public class PatternDetectionResultController {

    private final PatternDetectionResultService service;

    public PatternDetectionResultController(PatternDetectionResultService service) {
        this.service = service;
    }

    @GetMapping
    public List<PatternDetectionResult> getAll() {
        return service.getAllResults();
    }

    @GetMapping("/{id}")
    public PatternDetectionResult getById(@PathVariable Long id) {
        return service.getResultById(id);
    }
}
