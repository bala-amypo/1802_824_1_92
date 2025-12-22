package com.example.demo.service;

import com.example.demo.model.AnalysisLog;
import java.util.List;

public interface AnalysisLogService {

    // controller-compatible method
    AnalysisLog addLog(Long zoneId, String message);

    List<AnalysisLog> getLogsByZone(Long zoneId);
}
