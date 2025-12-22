package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class HotspotZone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String zoneName;

    public HotspotZone() {}

    public Long getId() { return id; }
    public String getZoneName() { return zoneName; }
}
