package com.example.demo.controllers;

import com.example.demo.model.PatternDetectionResult;
import com.example.demo.service.PatternDetectionResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pattern-results")
public class PatternDetectionResultController {

    private final PatternDetectionResultService service;

    @Autowired
    public PatternDetectionResultController(PatternDetectionResultService service) {
        this.service = service;
    }

    /**
     * Get all pattern detection results
     */
    @GetMapping
    public ModelMap getAll() {
        ModelMap map = new ModelMap();
        map.put("data", service.getAllResults());
        return map;
    }

    /**
     * Get pattern detection result by ID
     */
    @GetMapping("/{id}")
    public ModelMap getById(@PathVariable Long id) {
        ModelMap map = new ModelMap();
        map.put("data", service.getResultById(id));
        return map;
    }

    /**
     * Save a new pattern detection result
     */
    @PostMapping
    public ModelMap save(@RequestBody PatternDetectionResult result) {
        ModelMap map = new ModelMap();
        map.put("data", service.save(result));
        return map;
    }
}
