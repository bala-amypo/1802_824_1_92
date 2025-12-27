package com.example.demo.service.impl;

import com.example.demo.model.HotspotZone;
import com.example.demo.service.HotspotZoneService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotspotZoneServiceImpl implements HotspotZoneService {

    private final List<HotspotZone> zones = new ArrayList<>();

    @Override
    public void addZone(HotspotZone zone) {
        zones.add(zone);
    }

    @Override
    public List<HotspotZone> getAllZones() {
        return zones;
    }
}
