package com.isa.model;

import com.isa.model.enums.Gender;
import com.isa.model.enums.UserType;
import com.sun.istack.NotNull;

import javax.persistence.ManyToOne;

@javax.persistence.Entity
public class User extends Entity {
    @NotNull
    private String name;
    @NotNull
    private String surname;
    @NotNull
    private String email;
    @NotNull
    private String password;
    @NotNull
    private String address;
    @NotNull
    private String city;
    @NotNull
    private String country;
    @NotNull
    private String mobile;
    @NotNull
    private String uniquePersonalId;
    @NotNull
    private String profession;
    @NotNull
    private Gender gender;
    @ManyToOne
    private Centre centre;
    @NotNull
    private UserType userType;

    private String information;


    public User(String name, String surname, String email, String password, String address, String city,
                String country, String mobile, String uniquePersonalId, String profession,Gender gender,  UserType userType,
                String information) {

        this.name = name;
        this.surname = surname;
//        this.email = email;
//        this.password = password;
        this.address = address;
        this.city = city;
        this.country = country;
        this.mobile = mobile;
        this.uniquePersonalId = uniquePersonalId;
        this.profession = profession;
        this.gender = gender;
        this.userType = userType;
        this.information = information;
    }

    public User(){
        super();

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

    public String getRole(){
        return userType.toString();
    }

    public Centre getCentre() { return centre; }

    public void setCentre(Centre centre) { this.centre = centre; }

}
