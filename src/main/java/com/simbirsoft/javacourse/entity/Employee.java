package com.simbirsoft.javacourse.entity;

import org.springframework.stereotype.Component;


public class Employee {
    private String login;
    private String fio;
    private String dob;
    private String phone;
    private String email;
    private String skype;
    private String target;
    private String experiences;
    private String educations;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String name) {
        this.fio = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String age) {
        this.dob = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getExperiences() {
        return experiences;
    }

    public void setExperiences(String experiences) {
        this.experiences = experiences;
    }

    public String getEducations() {
        return educations;
    }

    public void setEducations(String educations) {
        this.educations = educations;
    }
}
