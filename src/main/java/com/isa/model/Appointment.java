package com.isa.model;

import javax.persistence.ManyToOne;
import java.util.Date;
@javax.persistence.Entity
public class Appointment extends Entity {

    @ManyToOne
    private Centre centre;
    private Date dateAndTime;
    private int duration;

    public Centre getCentre() {
        return centre;
    }

    public void setCentre(Centre centre) {
        this.centre = centre;
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
