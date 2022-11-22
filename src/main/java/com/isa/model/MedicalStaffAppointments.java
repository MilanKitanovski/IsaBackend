package com.isa.model;

import javax.persistence.ManyToOne;

@javax.persistence.Entity
public class MedicalStaffAppointments extends Entity {
    @ManyToOne
    private Appointment appointment;
    @ManyToOne
    private User user;

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
