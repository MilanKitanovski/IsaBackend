package com.isa.dto;

import com.isa.model.Centre;
import com.isa.model.Entity;

import java.util.Date;

public class CentreDTO extends Entity {

    private String name;
    private String address;
    private double longitude;
    private double latitude;
    private String description;
    private int centreGradeId;

    private Date startWork;
    private Date endWork;



    private String city;
    public CentreDTO(String name, String address, double longitude, double latitude, String description, int centreGradeId, String city, Date startWork, Date endWork) {
        this.name = name;
        this.address = address;
        this.longitude = longitude;
        this.latitude = latitude;
        this.description = description;
        this.centreGradeId = centreGradeId;
        this.startWork = startWork;
        this.endWork = endWork;
        this.city = city;
    }

    public CentreDTO() {

    }

    public Date getStartWork() {
        return startWork;
    }

    public void setStartWork(Date startWork) {
        this.startWork = startWork;
    }

    public Date getEndWork() {
        return endWork;
    }

    public void setEndWork(Date endWork) {
        this.endWork = endWork;
    }

    public CentreDTO covert(Centre centre){
        CentreDTO centreDTO = new CentreDTO();

        centreDTO.setName(centre.getName());
        centreDTO.setAddress(centre.getAddress());
        centreDTO.setLatitude(centre.getLatitude());
        centreDTO.setLatitude(centre.getLatitude());
        centreDTO.setDescription(centre.getDescription());
//        centreDTO.setCentreGradeId(centre.getCentreGradeId());
        centreDTO.setCity(centre.getCity());
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
