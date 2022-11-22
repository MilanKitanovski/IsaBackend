package com.isa.model.dto;

import com.isa.model.Entity;

import java.util.Date;

public class AppointmentDTO extends Entity {

    private int centreId;
    private Date dateAndTime;
    private int duration;

    public int getCentreId() {
        return centreId;
    }

    public void setCentreId(int centreId) {
        this.centreId = centreId;
    }

    public Date getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(Date dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
