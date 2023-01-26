package com.isa.service;

import com.isa.repository.AppointmentRepository;
import com.isa.model.Appointment;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AppointmentServiceImpl {
    private final AppointmentRepository appointmentRepository;

    private final CentreService centreService;


    public AppointmentServiceImpl(final AppointmentRepository appointmentRepository, CentreService centreService) {
        this.appointmentRepository = appointmentRepository;
        this.centreService = centreService;
    }

    //@Override
    public Appointment save(Appointment appointment) {
        if (!isExist(appointment))
            return appointmentRepository.save(appointment);
        else
            return null;
    }


    private boolean isExist(Appointment appointment) {
        List<Appointment> allAppointments = appointmentRepository.findAll();

        boolean isExist = false;

        for (Appointment a : allAppointments) {
            Date d = new Date(a.getDateAndTime().getTime() + ((long) a.getDuration() * 60 * 1000));
            isExist = a.getDateAndTime().after(appointment.getDateAndTime()) && d.before(appointment.getDateAndTime());
        }
        return isExist;
    }

    public List<Appointment> findAll() {
       return appointmentRepository.findAll();
    }

    public List<Appointment> findAllByDateAndTimeBetween(Date startTime, Date endTime,boolean b){
        return appointmentRepository.findAllByDateAndTimeBetween(startTime, endTime, b);
    }

    public Appointment findById(int id){
        return appointmentRepository.findById(id).get();
    }

    public Appointment update(Appointment appointment){
        return appointmentRepository.saveAndFlush(appointment);
    }

}
