package com.tek.service;

import java.util.List;

import com.tek.model.Employee;

public interface EmployeeService {

	Employee saveOrUpdateEmployeeDetails(Employee emp);

	List<Employee> getAllEmployeeList();

	Employee getEmployeeById(int id);

	void deleteEmployeeById(int id);
}
