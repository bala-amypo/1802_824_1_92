package com.example.demo.service;

import com.example.demo.model.AnalysisLog;
import java.util.List;

public interface AnalysisLogService {

    AnalysisLog addLog(long userId, String message);

    List<AnalysisLog> getLogs();

    List<AnalysisLog> getLogsByZone(Long zoneId);

    AnalysisLog getLogById(Long id);
}
