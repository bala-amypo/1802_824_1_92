package com.example.demo.service.impl;

import com.example.demo.entity.HotspotZone;
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
    public HotspotZone save(HotspotZone zone) {
        return repository.save(zone);
    }

    @Override
    public List<HotspotZone> findAll() {
        return repository.findAll();
    }
}

📌 Controller – HotspotZoneController.java
package com.example.demo.controller;

import com.example.demo.entity.HotspotZone;
import com.example.demo.service.HotspotZoneService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotspots")
public class HotspotZoneController {

    private final HotspotZoneService service;

    public HotspotZoneController(HotspotZoneService service) {
        this.service = service;
    }

    @PostMapping
    public HotspotZone create(@RequestBody HotspotZone zone) {
        return service.save(zone);
    }

    @GetMapping
    public List<HotspotZone> getAll() {
        return service.findAll();
    }
}