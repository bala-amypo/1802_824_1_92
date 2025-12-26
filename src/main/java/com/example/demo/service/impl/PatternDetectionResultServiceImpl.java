package com.example.demo.service.impl;

import com.example.demo.model.*;
import com.example.demo.repository.*;
import com.example.demo.service.PatternDetectionService;

import java.time.LocalDate;
import java.util.List;

public class PatternDetectionServiceImpl implements PatternDetectionService {

    private final HotspotZoneRepository zoneRepo;
    private final CrimeReportRepository reportRepo;
    private final PatternDetectionResultRepository resultRepo;
    private final AnalysisLogRepository logRepo;

    public PatternDetectionServiceImpl(
            HotspotZoneRepository z,
            CrimeReportRepository r,
            PatternDetectionResultRepository p,
            AnalysisLogRepository l){
        zoneRepo=z; reportRepo=r; resultRepo=p; logRepo=l;
    }

    public PatternDetectionResult detectPattern(Long zoneId){
        HotspotZone z = zoneRepo.findById(zoneId)
                .orElseThrow(() -> new RuntimeException("zone"));

        List<CrimeReport> list =
                reportRepo.findByLatLongRange(0,0,0,0);

        int count = list.size();
        String pattern =
                count>5 ? "High" : count>0 ? "Medium" : "No";

        PatternDetectionResult r = new PatternDetectionResult();
        r.setZone(z);
        r.setCrimeCount(count);
        r.setDetectedPattern(pattern);
        r.setAnalysisDate(LocalDate.now());

        resultRepo.save(r);
        logRepo.save(new AnalysisLog());
        zoneRepo.save(z);
        return r;
    }

    public List<PatternDetectionResult> getResultsByZone(Long zoneId){
        return resultRepo.findByZone_Id(zoneId);
    }
}
