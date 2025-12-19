package com.example.demo.service;
import jakarta.persistence.service;
import com.example.demo.model.AnalysisLog;
@Service
public interface AnalysisLogService{
    public AnalysisLog createAnalysisLog(AnalysisLog AnalyisLog);

    public AnalysisLog getAnalysisLog(Long id);
    public AnalysisLog getA
}