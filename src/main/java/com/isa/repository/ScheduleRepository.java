package com.isa.repository;

import com.isa.model.Centre;
import com.isa.model.Schedule;
import com.isa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {
    public Schedule findScheduleByStartWork(Date startTime);

    public Schedule findScheduleByEndWork(Date endTime);

    public Schedule findScheduleByUser(User patient);

    public Schedule findScheduleByCentre(Centre centre);

    public Schedule findScheduleByAdmin(User admin);

    public Schedule findById(int id);

    public List<Schedule> findScheduleByAdminId(int id);

    public List<Schedule> findScheduleByUserId(int id);

    public List<Schedule> findScheduleByCentreId(int id);
}
