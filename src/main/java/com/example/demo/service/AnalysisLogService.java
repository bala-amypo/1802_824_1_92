package com.example.demo.service;

import com.example.demo.model.AnalysisLog;

public interface AnalysisLogService {

    AnalysisLog addLog(long userId, String message);
}
