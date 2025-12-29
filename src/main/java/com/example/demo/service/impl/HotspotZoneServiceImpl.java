package com.example.demo.service.impl;

import com.example.demo.model.HotspotZone;
import com.example.demo.repository.HotspotZoneRepository;
import com.example.demo.service.HotspotZoneService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotspotZoneServiceImpl implements HotspotZoneService {

    private final HotspotZoneRepository repo;

    public HotspotZoneServiceImpl(HotspotZoneRepository repo) {
        this.repo = repo;
    }

    @Override
    public HotspotZone save(HotspotZone zone) {
        return repo.save(zone);
    }

    @Override
    public List<HotspotZone> findAll() {
        return repo.findAll();
    }
}
