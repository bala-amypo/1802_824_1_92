package com.example.demo.service.impl;

import com.example.demo.model.AnalysisLog;
import com.example.demo.model.HotspotZone;
import com.example.demo.repository.*;
import com.example.demo.service.AnalysisLogService;

import java.util.List;

public class AnalysisLogServiceImpl implements AnalysisLogService {

    private final AnalysisLogRepository logRepo;
    private final HotspotZoneRepository zoneRepo;

    public AnalysisLogServiceImpl(AnalysisLogRepository l, HotspotZoneRepository z) {
        this.logRepo = l;
        this.zoneRepo = z;
    }

    public AnalysisLog addLog(Long zoneId, String msg) {
        HotspotZone z = zoneRepo.findById(zoneId)
                .orElseThrow(() -> new RuntimeException("zone"));

        AnalysisLog log = new AnalysisLog();
        log.setMessage(msg);
        log.setZone(z);
        return logRepo.save(log);
    }

    public List<AnalysisLog> getLogsByZone(Long zoneId) {
        return logRepo.findByZone_Id(zoneId);
    }
}
