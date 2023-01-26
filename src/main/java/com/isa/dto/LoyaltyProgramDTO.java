package com.isa.dto;

import com.isa.model.Entity;
import com.isa.model.enums.UserCategory;

public class
LoyaltyProgramDTO extends Entity {

    private int userId;
    private int points;
    private UserCategory category;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
