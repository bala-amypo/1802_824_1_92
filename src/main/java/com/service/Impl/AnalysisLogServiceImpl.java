package com.example.demo.service;

import java.time.LocalDatetime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AnalysisLog;
import com.example.demo.repository.AnalysisLogRepository;

@Service
public class AnalysisLogServiceImpl implements AnalysisLogService{

@Autowired
private AnalysisLogRepository analysisLogRepository;

@Override
public AnalysisLog addLog(Long zoneId,String message) {
    AnalysisLog = new Analysislog();
    log.setZone(String.valueOf(zoneId));
    log.setMessage(message);
    log.setCreatedAt(LocalDateTime.now());

    return
}

return repo.save(logg);


}