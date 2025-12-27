package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class AnalysisLogService {

    public String getById(Long id) {
        return "Analysis log for ID: " + id;
    }
}
