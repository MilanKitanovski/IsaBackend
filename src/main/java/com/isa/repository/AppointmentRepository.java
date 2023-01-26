package com.isa.repository;

import com.isa.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface AppointmentRepository extends JpaRepository <Appointment, Integer> {

    @Query(value = "SELECT * FROM Appointment WHERE date_and_time BETWEEN ?1 AND ?2 AND reservate = false", nativeQuery = true)

    List<Appointment> findAllByDateAndTimeBetween(Date startTime, Date endTime, boolean b);

}
