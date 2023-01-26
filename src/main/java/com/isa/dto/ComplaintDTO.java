package com.isa.dto;

import com.isa.model.Entity;


public class ComplaintDTO extends Entity {

    private int centreId;
    private int userId;
    private String comment;

    public int getCentreId() {
        return centreId;
    }

    public void setCentreId(int centreId) {
        this.centreId = centreId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
