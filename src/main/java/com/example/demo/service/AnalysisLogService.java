package com.example.demo.service;

import java.util.List;

public interface AnalysisLogService {

    List<String> getLogs();

    List<String> getLogsByZone(Long zoneId);
}
