package com.isa.dto;

import com.isa.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class PasswordChangeDTO {

    private String oldPassword;
    private String newPassword;
    private User user;

    public PasswordChangeDTO(String oldPassword, String newPassword, User user) {
        this.oldPassword = oldPassword;
        this.newPassword = newPassword;
        this.user = user;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
