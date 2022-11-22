package com.isa.model.dto;

import com.isa.model.User;
import com.isa.model.enums.Gender;
import com.isa.model.enums.UserType;

public class UserDTO {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String address;
    private String city;
    private String country;
    private String mobile;
    private String uniquePersonalId;
    private String profession;
    private Gender gender;
    private int centreId;
    private UserType userType;
    private String information;

    public UserDTO(){

    }

    public UserDTO(int id, String name, String surname, String email, String password, String address, String city, String country, String mobile, String uniquePersonalId, String profession, Gender gender, int centreId, UserType userType, String information) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.address = address;
        this.city = city;
        this.country = country;
        this.mobile = mobile;
        this.uniquePersonalId = uniquePersonalId;
        this.profession = profession;
        this.gender = gender;
        this.centreId = centreId;
        this.userType = userType;
        this.information = information;
    }


    public UserDTO covert(User user){
        UserDTO userDto = new UserDTO();

        userDto.setAddress(user.getAddress());
        userDto.setCity(user.getCity());
        userDto.setEmail(user.getEmail());
        userDto.setCountry(user.getCountry());
        userDto.setName(user.getName());
        userDto.setSurname(user.getSurname());
        userDto.setInformation(user.getInformation());
        userDto.setMobile(user.getMobile());
        userDto.setPassword(user.getPassword());
        userDto.setUniquePersonalId(user.getUniquePersonalId());
        userDto.setGender(user.getGender());
        userDto.setAddress(user.getAddress());
        userDto.setUserType(user.getUserType());

        return userDto;
    }

    public User covertBack(UserDTO userDto){
        User user = new User();

        user.setAddress(userDto.getAddress());
        user.setCity(userDto.getCity());
        user.setEmail(userDto.getEmail());
        user.setCountry(userDto.getCountry());
        user.setName(userDto.getName());
        user.setSurname(userDto.getSurname());
        user.setInformation(userDto.getInformation());
        user.setMobile(userDto.getMobile());
        user.setPassword(userDto.getPassword());
        user.setUniquePersonalId(userDto.getUniquePersonalId());
        user.setGender(userDto.getGender());
        user.setAddress(userDto.getAddress());
        user.setUserType(userDto.getUserType());

        return user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUniquePersonalId() {
        return uniquePersonalId;
    }

    public void setUniquePersonalId(String uniquePersonalId) {
        this.uniquePersonalId = uniquePersonalId;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Gender getGender() {
        return gender;
    }

   public void setGender(Gender gender) {
        this.gender = gender;
    }

   public int getCentreId() {
        return centreId;
    }

    public void setCentreId(int centreId) {
        this.centreId = centreId;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
