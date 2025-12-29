@Service
public class CrimeReportServiceImpl implements CrimeReportService {

    private final CrimeReportRepository repo;

    public CrimeReportServiceImpl(CrimeReportRepository repo) {
        this.repo = repo;
    }

    public CrimeReport addReport(CrimeReport report) {
        return repo.save(report);
    }

    public List<CrimeReport> getAllReports() {
        return repo.findAll();
    }
}
