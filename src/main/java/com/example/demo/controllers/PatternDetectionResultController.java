package com.example.demo.controller;

import com.example.demo.model.PatternDetectionResult;
import com.example.demo.service.PatternDetectionResultService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/pattern-results")
public class PatternDetectionResultController {

    private final PatternDetectionResultService service;

    public PatternDetectionResultController(PatternDetectionResultService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<PatternDetectionResult> getById(@PathVariable Long id) {
        Optional<PatternDetectionResult> result = service.getById(id);
        return result.map(ResponseEntity::ok)
                     .orElse(ResponseEntity.notFound().build());
    }
}
