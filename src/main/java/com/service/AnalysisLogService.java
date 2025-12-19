package com.example.demo.service;
import jakarta.persistence.service;
import com.example.demo.model.AnalysisLog;
@Service
public interface AnalysisLogService{

    public AnalysisLog addLog(Long zoneId, String message);
    public 
    AnalysisLog List<AnalysisLog> getLogsByZone(Long zoneId);
}