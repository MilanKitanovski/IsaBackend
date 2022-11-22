package com.isa.model;

import com.sun.istack.NotNull;

import javax.persistence.ManyToOne;

@javax.persistence.Entity
public class Centre extends Entity {

    @NotNull
    private String name;
    @NotNull
    private String address;
    @NotNull
    private double longitude;
    @NotNull
    private double latitude;
    @NotNull
    private String description;
    @ManyToOne
    private CentreGrade avgGrade;

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

    public CentreGrade getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(CentreGrade avgGrade) {
        this.avgGrade = avgGrade;
    }
}
