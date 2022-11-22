package com.isa.model;

import com.isa.model.enums.UserCategory;

import javax.persistence.ManyToOne;

@javax.persistence.Entity
public class LoyaltyProgram extends Entity {
    @ManyToOne
    private User user;
    private int points;
    private UserCategory category;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public UserCategory getCategory() {
        return category;
    }

    public void setCategory(UserCategory category) {
        this.category = category;
    }
}
