package com.example.demo.controller;

import com.example.demo.model.HotspotZone;
import com.example.demo.service.HotspotZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotspot-zones")
public class HotspotZoneController {

    @Autowired
    private HotspotZoneService hotspotZoneService;

    // ✅ Create Hotspot Zone
    @PostMapping
    public HotspotZone createHotspotZone(@RequestBody HotspotZone zone) {
        return hotspotZoneService.save(zone);
    }

    // ✅ Get All Hotspot Zones
    @GetMapping
    public List<HotspotZone> getAllHotspotZones() {
        return hotspotZoneService.findAll();
    }
}
