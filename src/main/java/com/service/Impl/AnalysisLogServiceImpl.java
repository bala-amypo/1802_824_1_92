
@Service
public class AnalysisLogServiceImpl implements AnalysisLogService{

@Autowired
AnalysisLogRepository repo;
public AnalysisLog addLog(AnalysisLog logg){

return repo.save(logg);
}



}