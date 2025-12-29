package com.example.demo.service.impl;

import com.example.demo.model.AnalysisLog;
import com.example.demo.repository.AnalysisLogRepository;
import com.example.demo.repository.HotspotZoneRepository;
import com.example.demo.service.AnalysisLogService;

import java.util.ArrayList;
import java.util.List;

public class AnalysisLogServiceImpl implements AnalysisLogService {

    private final AnalysisLogRepository logRepo;
    private final HotspotZoneRepository zoneRepo;

    public AnalysisLogServiceImpl(
            AnalysisLogRepository logRepo,
            HotspotZoneRepository zoneRepo
    ) {
        this.logRepo = logRepo;
        this.zoneRepo = zoneRepo;
    }

    @Override
    public AnalysisLog addLog(long userId, String message) {
        AnalysisLog log = new AnalysisLog(userId, message);
        return logRepo.save(log);
    }

    @Override
    public List<AnalysisLog> getLogs() {
        return logRepo.findAll();
    }

    @Override
    public List<AnalysisLog> getLogsByZone(Long zoneId) {
        return logRepo.findByZoneId(zoneId);
    }

    @Override
    public AnalysisLog getLogById(Long id) {
        return logRepo.findById(id).orElse(null);
    }
}
