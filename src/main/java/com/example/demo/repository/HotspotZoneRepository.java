package com.example.demo.repository;

import com.example.demo.model.HotspotZone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HotspotZoneRepository extends JpaRepository<HotspotZone, Long> {

    // Required for zone lookup by name
    Optional<HotspotZone> findByZoneName(String zoneName);
}
