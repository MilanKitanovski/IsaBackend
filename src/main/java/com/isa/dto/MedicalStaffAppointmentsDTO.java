package com.isa.dto;

import com.isa.model.Entity;

public class MedicalStaffAppointmentsDTO extends Entity {

    private int appointmentId;
    private int userId;

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
