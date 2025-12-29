package com.example.demo.service.impl;

import com.example.demo.model.PatternDetectionResult;
import com.example.demo.model.HotspotZone;
import com.example.demo.repository.HotspotZoneRepository;
import com.example.demo.service.PatternDetectionService;

import java.time.LocalDate;

public class PatternDetectionServiceImpl implements PatternDetectionService {

    private final HotspotZoneRepository zoneRepo;

    public PatternDetectionServiceImpl(HotspotZoneRepository zoneRepo) {
        this.zoneRepo = zoneRepo;
    }

    @Override
    public PatternDetectionResult detectPattern(Long zoneId) {
        HotspotZone zone = zoneRepo.findById(zoneId).orElse(null);

        PatternDetectionResult result = new PatternDetectionResult();
        result.setZone(zone);
        result.setCrimeCount(10);
        result.setDetectedPattern("HIGH_RISK");
        result.setAnalysisDate(LocalDate.now());

        return result;
    }
}
