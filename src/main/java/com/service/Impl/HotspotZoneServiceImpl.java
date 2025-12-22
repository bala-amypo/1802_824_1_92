package com.example.demo.service.Impl;

import com.example.demo.model.HotspotZone;
import com.example.demo.repository.HotspotZoneRepository;
import com.example.demo.service.HotspotZoneService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotspotZoneServiceImpl implements HotspotZoneService {

    private final HotspotZoneRepository repository;

    public HotspotZoneServiceImpl(HotspotZoneRepository repository) {
        this.repository = repository;
    }

    @Override
    public HotspotZone createZone(HotspotZone zone) {
        return repository.save(zone);
    }

    @Override
    public HotspotZone getZoneByName(String zoneName) {
        return repository.findByZoneName(zoneName)
                .orElseThrow(() -> new RuntimeException("Zone not found"));
    }

    @Override
    public List<HotspotZone> getAllZones() {
        return repository.findAll();
    }
}
