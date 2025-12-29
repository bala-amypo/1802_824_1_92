@Service
public class HotspotZoneServiceImpl implements HotspotZoneService {

    private final HotspotZoneRepository repo;

    public HotspotZoneServiceImpl(HotspotZoneRepository repo) {
        this.repo = repo;
    }

    public HotspotZone save(HotspotZone zone) {
        return repo.save(zone);
    }

    public List<HotspotZone> findAll() {
        return repo.findAll();
    }
}
