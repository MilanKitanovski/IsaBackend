package com.isa.model.dto;

import com.isa.model.Centre;
import com.isa.model.Entity;

public class CentreDTO extends Entity {

    private String name;
    private String address;
    private double longitude;
    private double latitude;
    private String description;
    private int centreGradeId;

    public CentreDTO(String name, String address, double longitude, double latitude, String description, int centreGradeId) {
        this.name = name;
        this.address = address;
        this.longitude = longitude;
        this.latitude = latitude;
        this.description = description;
        this.centreGradeId = centreGradeId;
    }

    public CentreDTO() {

    }

    public CentreDTO covert(Centre centre){
        CentreDTO centreDTO = new CentreDTO();

        centreDTO.setName(centre.getName());
        centreDTO.setAddress(centre.getAddress());
        centreDTO.setLatitude(centre.getLatitude());
        centreDTO.setLatitude(centre.getLatitude());
        centreDTO.setDescription(centre.getDescription());
//        centreDTO.setCentreGradeId(centre.getCentreGradeId());

        return centreDTO;
    }


    public Centre covertBack(CentreDTO centreDTO){
        Centre centre = new Centre();

        centre.setName(centreDTO.getName());
        centre.setAddress(centreDTO.getAddress());
        centre.setLatitude(centreDTO.getLatitude());
        centre.setLatitude(centreDTO.getLatitude());
        centre.setDescription(centreDTO.getDescription());
//        centre.setCentreGradeId(centreDTO.getCentreGradeId());

        return centre;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCentreGradeId() {
        return centreGradeId;
    }

    public void setCentreGradeId(int centreGradeId) {
        this.centreGradeId = centreGradeId;
    }
}
