package com.isa.controller;

import com.isa.model.Appointment;
import com.isa.service.AppointmentServiceImpl;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/appointment")
@CrossOrigin(origins = "http://localhost:4200")
public class AppointmentController {
    private final AppointmentServiceImpl appointmentService;

    public AppointmentController(final AppointmentServiceImpl appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping
    @PreAuthorize("hasAuthority('CenterAdministrator')")
    public ResponseEntity<Appointment> save(@RequestBody Appointment appointment){
        Appointment appointment1 = appointmentService.save(appointment);

        if(appointment1 != null){
            return new ResponseEntity<>(appointment1, HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<List<Appointment>> getAllAppointment(){
        return new ResponseEntity<>(appointmentService.findAll(), HttpStatus.OK);
    }

    @SneakyThrows //try catch - lombok
    @GetMapping("/{startTimeD}/{endTimeD}/{reservate}")
    public ResponseEntity<List<Appointment>> getAllAppointment1(@PathVariable String startTimeD, @PathVariable String endTimeD, @PathVariable("reservate") boolean b){
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date startTime = format.parse(startTimeD);
        Date endTime = format.parse(endTimeD);
        return new ResponseEntity<>(appointmentService.findAllByDateAndTimeBetween(startTime, endTime, b), HttpStatus.OK);
    }
}
