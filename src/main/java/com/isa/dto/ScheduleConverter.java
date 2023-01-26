package com.isa.dto;

import com.isa.model.Schedule;

public class ScheduleConverter {

    public ScheduleDTO convertToDto(Schedule schedule){
        ScheduleDTO scheduleDTO = new ScheduleDTO();

            scheduleDTO.setStartWork(schedule.getStartWork());
            scheduleDTO.setEndWork(schedule.getEndWork());

        return  scheduleDTO;
    }

    public Schedule convertToObject(ScheduleDTO scheduleDTO){
        Schedule schedule = new Schedule();

        schedule.setStartWork(scheduleDTO.getStartWork());
        schedule.setEndWork(scheduleDTO.getEndWork());
        return schedule;
    }
}
