package com.example.demo.controllers;

import com.example.demo.model.PatternDetectionResult;
import com.example.demo.service.PatternDetectionResultService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pattern-results")
@Tag(name = "Pattern Detection Result Controller",
     description = "Crime pattern detection results")
public class PatternDetectionResultController {

    private final PatternDetectionResultService service;

    public PatternDetectionResultController(
            PatternDetectionResultService service) {
        this.service = service;
    }

    @Operation(summary = "Get all pattern detection results")
    @GetMapping
    public List<PatternDetectionResult> getResults() {
        return service.getResults();
    }

    @Operation(summary = "Get pattern detection result by ID")
    @GetMapping("/{id}")
    public PatternDetectionResult getById(@PathVariable Long id) {
        return service.getById(id);
    }
}
