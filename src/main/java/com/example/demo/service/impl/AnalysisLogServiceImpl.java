package com.example.demo.service.impl;

import com.example.demo.service.AnalysisLogService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnalysisLogServiceImpl implements AnalysisLogService {

    @Override
    public List<String> getLogs() {
        return new ArrayList<>();
    }

    @Override
    public List<String> getLogsByZone(Long zoneId) {
        return new ArrayList<>();
    }

    @Override
    public String getById(Long id) {
        return "Analysis log with id " + id;
    }
}
