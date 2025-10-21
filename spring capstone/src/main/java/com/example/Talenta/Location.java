package com.example.Talenta;

public class Location {
    private String province;
    private String District;
    private String sector;
    private String cell;
    private String village;
    
    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    public String getDistrict() {
        return District;
    }
    public void setDistrict(String district) {
        District = district;
    }
    public String getSector() {
        return sector;
    }
    public void setSector(String sector) {
        this.sector = sector;
    }
    public String getCell() {
        return cell;
    }
    public void setCell(String cell) {
        this.cell = cell;
    }
    public String getVillage() {
        return village;
    }
    public void setVillage(String village) {
        this.village = village;
    }
    public Location() {
    }
    public Location(String province, String district, String sector, String cell, String village) {
        this.province = province;
        District = district;
        this.sector = sector;
        this.cell = cell;
        this.village = village;
    }

}
