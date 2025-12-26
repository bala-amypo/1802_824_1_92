package com.example.demo.service.impl;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.model.*;
import com.example.demo.repository.*;
import com.example.demo.service.PatternDetectionService;

public class PatternDetectionServiceImpl implements PatternDetectionService {

    private final HotspotZoneRepository zoneRepo;
    private final CrimeReportRepository reportRepo;
    private final PatternDetectionResultRepository resultRepo;
    private final AnalysisLogRepository logRepo;

    public PatternDetectionServiceImpl(
            HotspotZoneRepository z,
            CrimeReportRepository r,
            PatternDetectionResultRepository p,
            AnalysisLogRepository l) {
        this.zoneRepo = z;
        this.reportRepo = r;
        this.resultRepo = p;
        this.logRepo = l;
    }

    public PatternDetectionResult detectPattern(Long zoneId) {
        HotspotZone zone = zoneRepo.findById(zoneId)
                .orElseThrow(() -> new RuntimeException("zone"));

        List<CrimeReport> crimes =
                reportRepo.findByLatLongRange(0,0,0,0);

        int count = crimes.size();
        String pattern =
                count > 5 ? "High Risk" :
                count > 0 ? "Medium Risk" : "No Risk";

        PatternDetectionResult res = new PatternDetectionResult();
        res.setZone(zone);
        res.setCrimeCount(count);
        res.setDetectedPattern(pattern);
        res.setAnalysisDate(LocalDate.now());

        resultRepo.save(res);
        logRepo.save(new AnalysisLog());
        zoneRepo.save(zone);

        return res;
    }

    public List<PatternDetectionResult> getResultsByZone(Long zoneId) {
        return resultRepo.findByZone_Id(zoneId);
    }
}
