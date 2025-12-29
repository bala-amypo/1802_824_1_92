package com.example.demo.service;

import java.util.List;
import com.example.demo.model.HotspotZone;

public interface HotspotZoneService {

    HotspotZone save(HotspotZone zone);

    List<HotspotZone> findAll();

    HotspotZone findById(Long id);
}
