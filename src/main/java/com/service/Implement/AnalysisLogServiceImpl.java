package com.example.demo.service.impl;








@Service
public class AnalysisLogServiceImpl implements AnalysisLogService{

    @Autowired
    AnalysisLogRepository alr;
    public AnalysisLog createAnalysislog(Analysislog log){

        return alr.save(log);
    }


}