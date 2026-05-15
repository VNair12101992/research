package com.learn.research.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @Column(name = "empId", length = 20)
    private String empId;

    @Column(name = "designation", length = 20)
    private String designation;

    @Column(name = "firstName", length = 20)
    private String firstName;

    @Column(name = "lastName", length = 20)
    private String lastName;

    @Column(name = "location", length = 20)
    private String location;

    @Column(name = "country", length = 3)
    private String country;

    @Column(name = "region", length = 10)
    private String region;


    // Constructors
    public Employee() {
    }

    public Employee(String empId, String designation, String firstName, String lastName,
                    String location, String country, String region) {
        this.empId = empId;
        this.designation = designation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.country = country;
        this.region = region;
    }

    // Getters and Setters
    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", designation='" + designation + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", location='" + location + '\'' +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}

