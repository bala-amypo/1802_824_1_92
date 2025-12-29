package com.example.demo.service.impl;

import com.example.demo.model.AnalysisLog;
import com.example.demo.model.HotspotZone;
import com.example.demo.repository.AnalysisLogRepository;
import com.example.demo.repository.HotspotZoneRepository;
import com.example.demo.service.AnalysisLogService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
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

    @Override
    public AnalysisLog addLog(long zoneId, String message) {
        HotspotZone zone = zoneRepo.findById(zoneId).orElse(null);

        AnalysisLog log = new AnalysisLog();
        log.setMessage(message);
        log.setZone(zone);
        log.setLoggedAt(LocalDateTime.now());

        return logRepo.save(log);
    }
}
