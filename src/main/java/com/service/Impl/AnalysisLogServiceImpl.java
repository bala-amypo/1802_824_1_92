package com.example.demo.service.impl;
import com.example.demo.repository.AnalysisLogRepository;
import com.example.demo.model.AnalysisLog;
import com.example.demo.service.AnalysisLogService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class AnalysisLogServiceImpl implements AnalysisLogService{

    @Autowired
    AnalysisLogRepository alr;
    public AnalysisLog createAnalysislog(AnalysisLog log){

        return alr.save(log);
    }


}