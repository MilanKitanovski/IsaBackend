package com.isa.model.dto;

import com.isa.model.Entity;

public class CentreGradeDTO extends Entity {

    private int centreId;
    private int grade;

    public int getCentreId() {
        return centreId;
    }

    public void setCentreId(int centreId) {
        this.centreId = centreId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
