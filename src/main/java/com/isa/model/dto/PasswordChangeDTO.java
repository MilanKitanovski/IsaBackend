package com.isa.model.dto;

import com.isa.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PasswordChangeDTO {

    private String oldPassword;
    private String newPassword1;
    private String newPassword2;
    private User user;

}
