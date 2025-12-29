package com.example.demo.service.impl;

import com.example.demo.model.AnalysisLog;
import com.example.demo.repository.AnalysisLogRepository;
import com.example.demo.repository.HotspotZoneRepository;
import com.example.demo.service.AnalysisLogService;

public class AnalysisLogServiceImpl implements AnalysisLogService {

    private final AnalysisLogRepository repo;
    private final HotspotZoneRepository zoneRepo;

    public AnalysisLogServiceImpl(
            AnalysisLogRepository repo,
            HotspotZoneRepository zoneRepo
    ) {
        this.repo = repo;
        this.zoneRepo = zoneRepo;
    }

    @Override
    public AnalysisLog addLog(long userId, String message) {
        AnalysisLog log = new AnalysisLog(userId, message);
        return repo.save(log);
    }
}
