package com.example.demo.service;

import com.example.demo.model.AnalysisLog;
import java.util.List;

public interface AnalysisLogService {

    List<AnalysisLog> getLogs();

    List<AnalysisLog> getLogsByZone(Long zoneId);

    AnalysisLog getLogById(Long id);

    AnalysisLog addLog(long zoneId, String message);
}
