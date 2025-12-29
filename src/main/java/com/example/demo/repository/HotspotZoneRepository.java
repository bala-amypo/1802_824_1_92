package com.example.demo.repository;

import com.example.demo.model.HotspotZone;
import java.util.List;

public interface HotspotZoneRepository {

    boolean existsByZoneName(String zoneName);

    List<HotspotZone> findByZoneName(String zoneName);

    List<HotspotZone> findBySeverityLevel(String severityLevel);

    HotspotZone save(HotspotZone zone);
}
