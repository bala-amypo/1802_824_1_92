package com.example.demo.repository;

import com.example.demo.model.CrimeReport;
import java.util.List;

public interface CrimeReportRepository {

    List<CrimeReport> findByLatLongRange(
            double minLat,
            double maxLat,
            double minLong,
            double maxLong
    );
}
