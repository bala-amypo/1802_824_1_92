package com.example.demo.controller;

import com.example.demo.model.HotspotZone;
import com.example.demo.service.HotspotZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotspots")
public class HotspotZoneController {

    @Autowired
    private HotspotZoneService hotspotZoneService;

    @PostMapping
    public HotspotZone create(@RequestBody HotspotZone zone) {
        return hotspotZoneService.save(zone);
    }

    @GetMapping
    public List<HotspotZone> getAll() {
        return hotspotZoneService.findAll();
    }
}
