package com.isa.controller;

import com.isa.model.Schedule;
import com.isa.dto.ScheduleConverter;
import com.isa.dto.ScheduleDTO;
import com.isa.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("api/schedule")
@CrossOrigin(origins = "http://localhost:4200")
public class ScheduleConteroller {
    @Autowired
    ScheduleService scheduleService;

//    //Dobavljanje po doktru, pacijentu - svih zakazivanja
//    @PostMapping(path="/scheduling", consumes = "application/json")
//    public ResponseEntity<?> scheduling(@RequestBody ScheduleDTO dto){
////     return new ResponseEntity<>(scheduleService.scheduling(dto));
//   }
@GetMapping(value = "/all")
public ResponseEntity<List<ScheduleDTO>> getAllSchedules() {

    List<Schedule> schedules = scheduleService.findAll();

    List<ScheduleDTO> dto = new ArrayList<>();
    for (Schedule schedule : schedules) {

        dto.add(new ScheduleConverter().convertToDto(schedule));
    }

    return new ResponseEntity<>(dto, HttpStatus.OK);
}

@GetMapping(value = "/admin/{id}")
public ResponseEntity<List<Schedule>> findScheduleByAdminId(@PathVariable int id){
    return new ResponseEntity<>(scheduleService.findAdminSchedule(id), HttpStatus.OK);
}

@GetMapping(value = "/patient/{id}")
public ResponseEntity<List<Schedule>> findScheduleByUserId(@PathVariable int id){
    return new ResponseEntity<>(scheduleService.findPatientSchedule(id), HttpStatus.OK);
}

@GetMapping(value = "/centre/{id}")
    public ResponseEntity<List<Schedule>> findScheduleByCentreId(@PathVariable int id){
    return new ResponseEntity<>(scheduleService.findCentreSchedule(id), HttpStatus.OK);
}




}
