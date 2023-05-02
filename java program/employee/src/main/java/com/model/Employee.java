package com.model;

import java.util.Date;

public class Employee {

    private String id;
    private String name;
    private Date dateOfJoining;
    private double salary;
    private long mobile;
    private String email;

    public Employee() {
    }

    public Employee(String id, String name, Date dateOfJoining, double salary, long mobile, String email) {
        this.id = id;
        this.name = name;
        this.dateOfJoining = dateOfJoining;
        this.salary = salary;
        this.mobile = mobile;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfJoining=" + dateOfJoining +
                ", salary=" + salary +
                ", mobile=" + mobile +
                ", email='" + email + '\'' +
                '}';
    }
}
