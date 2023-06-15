package com.tek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tek.model.Employee;
import com.tek.service.EmployeeService;

@RestController
@RequestMapping("v1/api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/save")
	public ResponseEntity<?> saveEmployeeDetails(@RequestBody Employee emp) {
		Employee employee = service.saveOrUpdateEmployeeDetails(emp);
		return new ResponseEntity<>(employee, HttpStatus.CREATED);
	}

	@GetMapping("/list")
	public ResponseEntity<?> fetchAllEmployeeDetais() {
		List<Employee> allEmployeeList = service.getAllEmployeeList();
		return new ResponseEntity<>(allEmployeeList, HttpStatus.OK);
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<?> findEmployeeById(@PathVariable("id") int id) {
		Employee employeeById = service.getEmployeeById(id);
		if (employeeById != null) {
			return new ResponseEntity<>(employeeById, HttpStatus.FOUND);
		}
		return new ResponseEntity<>("No Employee Id" + id + " is not FOund", HttpStatus.FOUND);
	}

	@DeleteMapping("delete/{id}")
	public ResponseEntity<?> deleteEmployeeById(@PathVariable("id") int empId) {
		Employee byId = service.getEmployeeById(empId);
		if (byId != null) {
			service.deleteEmployeeById(empId);
			return new ResponseEntity<>("Employee is Deleted", HttpStatus.FOUND);
		}
		return new ResponseEntity<>("No Employee is Deleted", HttpStatus.NOT_FOUND);

	}

	@PutMapping("/update")
	public ResponseEntity<?> updateEmployeeDetails(@RequestBody Employee employee) {
		Employee updateEmployeeDetails = service.saveOrUpdateEmployeeDetails(employee);
		if (updateEmployeeDetails != null) {
			return new ResponseEntity<>(updateEmployeeDetails, HttpStatus.OK);
		}
		return new ResponseEntity<>("No Employee Details Updated", HttpStatus.NOT_FOUND);
	}

}
