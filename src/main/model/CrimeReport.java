package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class CrimeReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    public CrimeReport() {}
}
