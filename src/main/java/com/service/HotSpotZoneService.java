package com.example.demo.service;
import jakarta.persistence.service;
import com.example.demo.model.HotspotZone;
@Service
public interface HotspotZoneService{

    public HotspotZone addZone(HotspotZone zone);
    public HotspotZone List<HotspotZone> getAllZones();
}