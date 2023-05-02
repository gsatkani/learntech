package com.service;

import com.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> employeeList=new ArrayList<Employee>();
    public boolean addEmployeeDetail(Employee employee) {
        boolean status = employeeList.add(employee);
        return status;
    }
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public Employee deleteEmployeeById(int id) {
        // your task
        // list contains id 0r not
        // iterate -> find incex remove / employee
        return null;
    }
}
