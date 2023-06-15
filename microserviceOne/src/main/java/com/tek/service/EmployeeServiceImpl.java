package com.tek.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tek.model.Employee;
import com.tek.repository.EmployeeRepository;



@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository repository;

	@Override
	public Employee saveOrUpdateEmployeeDetails(Employee emp) {
		// innsert into employee() values()
		Employee save = repository.save(emp);
		return save;
	}

	@Override
	public List<Employee> getAllEmployeeList() {
		// select * fro employee
		List<Employee> findAll = repository.findAll();
		return findAll;
	}

	@Override
	public Employee getEmployeeById(int id) {
		Optional<Employee> findById = repository.findById(id);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public void deleteEmployeeById(int id) {
		repository.deleteById(id);
		
	}

}
