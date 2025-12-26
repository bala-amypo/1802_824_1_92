package com.example.demo.model;

public class HotspotZone {
    private Long id;
    private String zoneName;
    private Double centerLat;
    private Double centerLong;
    private String severityLevel = "LOW";

    public Long getId(){ return id; }
    public void setId(Long id){ this.id=id; }

    public String getZoneName(){ return zoneName; }
    public void setZoneName(String z){ zoneName=z; }

    public Double getCenterLat(){ return centerLat; }
    public void setCenterLat(Double d){ centerLat=d; }

    public Double getCenterLong(){ return centerLong; }
    public void setCenterLong(Double d){ centerLong=d; }

    public String getSeverityLevel(){ return severityLevel; }
    public void setSeverityLevel(String s){ severityLevel=s; }
}
