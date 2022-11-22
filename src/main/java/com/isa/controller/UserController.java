package com.isa.controller;

import com.isa.model.User;
import com.isa.model.dto.LoginDTO;
import com.isa.model.dto.PasswordChangeDTO;
import com.isa.model.dto.UserDTO;
import com.isa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {


    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private UserService userService ;

    @GetMapping(path = "/{id}")
    public ResponseEntity<User> findByID(@PathVariable int id){
        return new ResponseEntity<>(userService.findById(id), HttpStatus.OK);
    }

   @PutMapping(path = "/update-user")
    public ResponseEntity<User> update(@RequestBody UserDTO userDTO) {
        return new ResponseEntity<>(userService.update(userDTO), HttpStatus.OK);
    }


/*
    @PostMapping(path = "/add-user")
    public ResponseEntity<User> add(@RequestBody UserDTO userDTO){
        return new ResponseEntity<User>(userService.add(userDTO), HttpStatus.OK);
    } */


    @GetMapping(value = "/all")
    public ResponseEntity<List<UserDTO>> getAllUsers() {

        List<User> users = userService.findAll();

        // convert users to DTOs
        List<UserDTO> dto = new ArrayList<>();
        for (User user : users) {
            //dto.add(new UserDTO(user));
            dto.add(new UserDTO().covert(user)); //nad UserDTO pozivamo njegovu metodu
        }

        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @PostMapping(value = "/login", consumes = "application/json")
    public ResponseEntity<String> login(@RequestBody LoginDTO userDto) {

        User user = userService.findOneByEmail(userDto.getEmail());

        if(user.getPassword().equals(userDto.getPassword())){
            return new ResponseEntity<>("Uspesno logovan", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("User nije pronadjen", HttpStatus.NOT_FOUND);
        }
    }

//    @PutMapping(value = "{id}/passwordChange", consumes = "application/json")
//    public ResponseEntity<PasswordChangeDTO> updateUserPassword(@RequestBody PasswordChangeDTO passwordChangeDTO, @PathVariable int id) {
//        User user = userService.findById(id);
//        if (user.getId() == id) {
//            if (passwordChangeDTO.getOldPassword() == null || passwordChangeDTO.getNewPassword() == null) {
//                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//            } else {
//
//                BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder();
//                if (bcpe.matches(passwordChangeDTO.getOldPassword(), user.getPassword())) {
//                    userService.changePassword(user.getEmail(), passwordChangeDTO.getNewPassword());
//                } else {
//                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//                }
//                return new ResponseEntity<>(new PasswordChangeDTO(passwordChangeDTO.getOldPassword(), passwordChangeDTO.getNewPassword(), passwordChangeDTO.getUser()), HttpStatus.OK);
//            }
//        }
//        return new ResponseEntity<>(HttpStatus.OK);
//    }

    @GetMapping(path = "/{email}")
    public ResponseEntity<UserDTO> findUserByEmail (@PathVariable String email) {

        User user = userService.findOneByEmail(email);
        return new ResponseEntity<>(new UserDTO().covert(user), HttpStatus.OK);
    }


}
