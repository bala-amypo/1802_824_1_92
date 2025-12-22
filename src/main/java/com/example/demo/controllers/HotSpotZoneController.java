package com.example.demo.controllers;

import com.example.demo.model.HotspotZone;
import com.example.demo.service.HotspotZoneService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zones")
@Tag(name = "Hotspot Zone Controller")
public class HotspotZoneController {

    private final HotspotZoneService hotspotZoneService;

    public HotspotZoneController(HotspotZoneService hotspotZoneService) {
        this.hotspotZoneService = hotspotZoneService;
    }

    @PostMapping
    public HotspotZone createZone(@RequestBody HotspotZone zone) {
        return hotspotZoneService.createZone(zone);
    }

    @GetMapping
    public List<HotspotZone> getAllZones() {
        return hotspotZoneService.getAllZones();
    }
}
