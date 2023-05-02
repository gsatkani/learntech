package com.tek;

import java.util.Date;

// class - template/blueprint to create objects
public class Employee {
    //Instance Variable
    // State
   private String empId;
   private String empName;
    private Date dateOfJoining;
    private double salary;
    private long phone;
    private String email;
    // instance methods

   public Employee() {
    }

    public Employee(String id, String name, Date doj, double salary, long phone, String email) {
        this.empId = id;
        this.empName = name;
        this.dateOfJoining = doj;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
    }
    // Using getter and setter methods we can access private data

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
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

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayEmployeeDeatils(){
        System.out.println(empId +"--"+empName+"--"+dateOfJoining+"--"+salary+"--"+phone+"--"+email);
    }
}
