package com.example.demo.service.Impl;

import com.example.demo.model.*;
import com.example.demo.repository.*;
import com.example.demo.service.PatternDetectionService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PatternDetectionServiceImpl implements PatternDetectionService {

    private final CrimeReportRepository crimeRepo;
    private final HotspotZoneRepository zoneRepo;
    private final PatternDetectionResultRepository resultRepo;

    public PatternDetectionServiceImpl(
            CrimeReportRepository crimeRepo,
            HotspotZoneRepository zoneRepo,
            PatternDetectionResultRepository resultRepo) {

        this.crimeRepo = crimeRepo;
        this.zoneRepo = zoneRepo;
        this.resultRepo = resultRepo;
    }

    @Override
    public PatternDetectionResult analyzeZone(Long zoneId) {

        HotspotZone zone = zoneRepo.findById(zoneId)
                .orElseThrow(() -> new RuntimeException("Zone not found"));

        List<CrimeReport> crimes =
                crimeRepo.findByLatitudeBetweenAndLongitudeBetween(
                        zone.getCenterLat() - 0.01,
                        zone.getCenterLat() + 0.01,
                        zone.getCenterLong() - 0.01,
                        zone.getCenterLong() + 0.01
                );

        int count = crimes.size();
        String pattern;

        if (count > 5) pattern = "High";
        else if (count > 2) pattern = "Medium";
        else pattern = "No";

        PatternDetectionResult result = new PatternDetectionResult();
        result.setZone(zone);
        result.setAnalysisDate(LocalDate.now());
        result.setCrimeCount(count);
        result.setDetectedPattern(pattern);

        return resultRepo.save(result);
    }
}
