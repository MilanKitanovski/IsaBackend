package com.isa.dto;

import com.isa.model.Schedule;

import java.util.Date;

public class ScheduleDTO {
    private int adminid;

    private Date startWork;

    private Date endWork;

    private int userid;

    private int centreId;


    public ScheduleDTO(int adminid, Date startWork, Date endWork, int userid, int centreId) {
        this.adminid = adminid;
        this.startWork = startWork;
        this.endWork = endWork;
        this.userid = userid;
        this.centreId = centreId;
    }

    public ScheduleDTO(){

    }

    public int getAdminid() {
        return adminid;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    public Date getStartWork() {
        return startWork;
    }

    public void setStartWork(Date startWork) {
        this.startWork = startWork;
    }

    public Date getEndWork() {
        return endWork;
    }

    public void setEndWork(Date endWork) {
        this.endWork = endWork;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getCentreId() {
        return centreId;
    }

    public void setCentreId(int centreId) {
        this.centreId = centreId;
    }
}
