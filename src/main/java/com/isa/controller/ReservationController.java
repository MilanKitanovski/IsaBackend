package com.isa.controller;

import com.isa.model.Appointment;
import com.isa.model.Reservation;
import com.isa.model.ReservationRequest;
import com.isa.service.AppointmentServiceImpl;
import com.isa.service.ReservationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/reservation")
public class ReservationController {

    private final ReservationService reservationService;
    private final AppointmentServiceImpl appointmentService;

    public ReservationController(ReservationService reservationService, AppointmentServiceImpl appointmentService) {
        this.reservationService = reservationService;
        this.appointmentService = appointmentService;
    }


    @GetMapping
    public ResponseEntity<List<Reservation>> findAllReservation(@RequestParam int id){
        return new ResponseEntity<>(reservationService.findAllByUserId(id), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Boolean> isPastSixMonth(@PathVariable int id){
        return new ResponseEntity<>(reservationService.isPastSixMonth(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Reservation> save(@RequestBody ReservationRequest reservationRequest){
        Appointment appointment = appointmentService.findById(reservationRequest.getAppointmentId());
        appointment.setReserved(true);
        appointmentService.update(appointment);
        return new ResponseEntity(reservationService.save(reservationRequest), HttpStatus.CREATED);
    }
}
