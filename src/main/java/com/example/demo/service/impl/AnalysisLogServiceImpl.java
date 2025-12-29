package com.example.demo.service.impl;

import com.example.demo.model.AnalysisLog;
import com.example.demo.repository.*;
import com.example.demo.service.AnalysisLogService;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class AnalysisLogServiceImpl implements AnalysisLogService {

    private final AnalysisLogRepository logRepo;
    private final HotspotZoneRepository zoneRepo;

    public AnalysisLogServiceImpl(
            AnalysisLogRepository logRepo,
            HotspotZoneRepository zoneRepo) {
        this.logRepo = logRepo;
        this.zoneRepo = zoneRepo;
    }

    public AnalysisLog addLog(long zoneId, String message) {
        AnalysisLog log = new AnalysisLog();
        log.setMessage(message);
        log.setLoggedAt(LocalDateTime.now());
        log.setZone(zoneRepo.findById(zoneId).orElse(null));
        return logRepo.save(log);
    }
}
