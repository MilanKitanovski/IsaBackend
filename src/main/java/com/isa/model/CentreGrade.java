package com.isa.model;

import javax.persistence.ManyToOne;

@javax.persistence.Entity
public class CentreGrade extends Entity {
    @ManyToOne
    private Centre centre;
    private int grade;

    public Centre getCentre() {
        return centre;
    }

    public void setCentre(Centre centre) {
        this.centre = centre;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
