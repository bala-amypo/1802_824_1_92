package com.example.demo.controllers;

import com.example.demo.model.HotspotZone;
import com.example.demo.service.HotspotZoneService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/zones")
@Tag(name = "Hotspot Zone Controller", description = "Hotspot zone APIs")
public class HotspotZoneController {

    private final HotspotZoneService service;

    public HotspotZoneController(HotspotZoneService service) {
        this.service = service;
    }

    @Operation(summary = "Create hotspot zone")
    @PostMapping
    public HotspotZone saveZone(@RequestBody HotspotZone zone) {
        return service.save(zone);
    }

    @Operation(summary = "Get all hotspot zones")
    @GetMapping
    public List<HotspotZone> getAllZones() {
        return service.findAll();
    }
}
