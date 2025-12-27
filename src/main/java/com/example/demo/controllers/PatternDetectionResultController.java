package com.example.demo.controller;

import com.example.demo.service.PatternDetectionResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patterns")
public class PatternDetectionResultController {

    @Autowired
    private PatternDetectionResultService service;

    @GetMapping
    public String getResults() {
        return service.getResults();
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable Long id) {
        return service.getById(id);
    }
}
