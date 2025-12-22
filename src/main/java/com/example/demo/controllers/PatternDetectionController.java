package com.example.demo.controllers;

import com.example.demo.model.PatternDetectionResult;
import com.example.demo.repository.PatternDetectionResultRepository;
import com.example.demo.service.PatternDetectionService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patterns")
@Tag(name = "Pattern Detection Controller")
public class PatternDetectionController {

    private final PatternDetectionService patternService;
    private final PatternDetectionResultRepository resultRepository;

    public PatternDetectionController(
            PatternDetectionService patternService,
            PatternDetectionResultRepository resultRepository) {

        this.patternService = patternService;
        this.resultRepository = resultRepository;
    }

    @PostMapping("/detect/{zoneId}")
    public PatternDetectionResult detect(@PathVariable Long zoneId) {
        return patternService.analyzeZone(zoneId);
    }

    @GetMapping("/zone/{zoneId}")
    public List<PatternDetectionResult> getResults(@PathVariable Long zoneId) {
        return resultRepository.findByZone_Id(zoneId);
    }
}
