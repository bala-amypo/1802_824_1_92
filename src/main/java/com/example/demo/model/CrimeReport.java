package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class CrimeReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double latitude;
    private double longitude;
    private String description;

    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }
}
