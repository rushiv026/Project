package com.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Emp {
    @Id
    private Long id;
    private String name;
    private String address;
    private double salary;
    private String gender;
    private String education;

    public Emp(Long id, String name, String address, double salary, String gender, String education) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.gender = gender;
        this.education = education;
    }

    public Emp() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
