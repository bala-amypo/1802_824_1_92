public class AnalysisLogServiceImpl implements AnalysisLogService {

    private final AnalysisLogRepository repository;

    public AnalysisLogServiceImpl(AnalysisLogRepository repository) {
        this.repository = repository;
    }

    @Override
    public AnalysisLog addLog(long userId, String message) {
        AnalysisLog log = new AnalysisLog();
        log.setMessage(message);
        return repository.save(log);
    }
}
