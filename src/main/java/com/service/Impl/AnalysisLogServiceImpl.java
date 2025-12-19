package com.example.demo.service;

import java.time.LocalDatetime;
import java.util.List;
@Service
public class AnalysisLogServiceImpl implements AnalysisLogService{

@Autowired
AnalysisLogRepository repo;
public AnalysisLog addLog(AnalysisLog logg){

return repo.save(logg);
}



}