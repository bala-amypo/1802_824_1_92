package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.HotspotZone;
import com.example.demo.repository.HotspotZoneRepository;
import com.example.demo.service.HotspotZoneService;

@Service
public class HotspotZoneServiceImpl implements HotspotZoneService {

    private final HotspotZoneRepository repository;

    public HotspotZoneServiceImpl(HotspotZoneRepository repository) {
        this.repository = repository;
    }

    @Override
    public HotspotZone save(HotspotZone zone) {
        return repository.save(zone);
    }

    @Override
    public List<HotspotZone> findAll() {
        return repository.findAll();
    }

    @Override
    public HotspotZone findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
