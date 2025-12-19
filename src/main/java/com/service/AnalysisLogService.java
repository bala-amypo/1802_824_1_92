package com.example.demo.service;
import jakarta.persistence.service;
import com.example.demo.model.AnalysisLog;
@Service
public interface AnalysisLogService{
    public AnalysisLog createAnalysisLog(Analy

    public AnalysisLog addLog(Long zoneId, String message);
    public List<Analysis
}