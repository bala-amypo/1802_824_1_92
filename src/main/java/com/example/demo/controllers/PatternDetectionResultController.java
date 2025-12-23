package com.example.demo.controller;

import com.example.demo.entity.PatternDetectionResult;
import com.example.demo.service.PatternDetectionResultService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pattern-results")
public class PatternDetectionResultController {

    private final PatternDetectionResultService service;

    public PatternDetectionResultController(
            PatternDetectionResultService service) {
        this.service = service;
    }

    @PostMapping
    public PatternDetectionResult create(
            @RequestBody PatternDetectionResult result) {
        return service.save(result);
    }

    @GetMapping
    public List<PatternDetectionResult> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public PatternDetectionResult getById(
            @PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(
            @PathVariable Long id) {
        service.deleteById(id);
    }
}