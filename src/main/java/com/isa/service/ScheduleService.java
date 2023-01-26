package com.isa.service;

import com.isa.repository.ScheduleRepository;
import com.isa.model.Centre;
import com.isa.model.Schedule;
import com.isa.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ScheduleService {
    @Autowired
    ScheduleRepository scheduleRepository;

    public List<Schedule> findAll(){
        return  scheduleRepository.findAll();
    }

    public Schedule findScheduleByStartWork(Date startTime){
       return scheduleRepository.findScheduleByStartWork(startTime);
    }

    public Schedule findScheduleByEndWork(Date endTime){
        return scheduleRepository.findScheduleByEndWork(endTime);
    }

    public Schedule findScheduleByUser(User patient) {
        return scheduleRepository.findScheduleByUser(patient);
    }


    public Schedule findScheduleByCentre(Centre centre){
        return scheduleRepository.findScheduleByCentre(centre);
    }

    public Schedule findScheduleByAdmin(User admin){
        return scheduleRepository.findScheduleByAdmin(admin);
    }

    public List<Schedule> findAdminSchedule(int id){
        List<Schedule> adminSchedule = scheduleRepository.findScheduleByAdminId(id);

        return adminSchedule;
    }

    public List<Schedule> findPatientSchedule(int id){ //uz pomoc id korisnika (pacijenta) nalazimo zakazivanja za njega
        List<Schedule> patientSchedule = scheduleRepository.findScheduleByUserId(id);

        return patientSchedule;
    }

    public List<Schedule>  findCentreSchedule(int id){
        List<Schedule> centreSchedule = scheduleRepository.findScheduleByCentreId(id);

        return centreSchedule;
    }


//    public Schedule findById(int id){
//        return scheduleRepository.findById(id);
//    }


}
