@Service
public class AnalysisLogServiceImpl implements AnalysisLogService {

    private final AnalysisLogRepository repo;

    public AnalysisLogServiceImpl(AnalysisLogRepository repo) {
        this.repo = repo;
    }

    public List<AnalysisLog> getLogs() {
        return repo.findAll();
    }

    public List<AnalysisLog> getLogsByZone(Long zoneId) {
        return repo.findByZone_Id(zoneId);
    }

    public AnalysisLog getLogById(Long id) {
        return repo.findById(id).orElse(null);
    }
}
