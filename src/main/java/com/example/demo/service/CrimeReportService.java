package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CrimeReportService {

    public String getAllReports() {
        return "Crime reports fetched successfully";
    }
}
