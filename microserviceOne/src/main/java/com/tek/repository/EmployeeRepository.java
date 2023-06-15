package com.tek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tek.model.Employee;

@Repository 
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
    // CrudRepository - Interface for generic CRUD operations on a repository for a specific type.
	// Spring Data JPA  --- Implementation of Hibernate
	
}
