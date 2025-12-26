package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "crime_report")
public class CrimeReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    public CrimeReport() {}
}
