public class HotspotZone {

    private String zoneName;
    private double centerLat;
    private double centerLong;

    public double getCenterLat() {
        return centerLat;
    }

    public void setCenterLat(double centerLat) {
        this.centerLat = centerLat;
    }

    public double getCenterLong() {
        return centerLong;
    }

    public void setCenterLong(double centerLong) {
        this.centerLong = centerLong;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }
}
