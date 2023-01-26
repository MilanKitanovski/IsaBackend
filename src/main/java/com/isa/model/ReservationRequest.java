package com.isa.model;

import lombok.Data;

@Data
public class ReservationRequest {
    private String userEmail;
    private int appointmentId;
}
