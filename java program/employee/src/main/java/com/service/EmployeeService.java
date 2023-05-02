package com.service;

import com.model.Employee;

import java.util.List;

public interface EmployeeService {

    public boolean addEmployeeDetail(Employee employee);
    public List<Employee> getEmployeeList();

    public Employee deleteEmployeeById(int id);

}
