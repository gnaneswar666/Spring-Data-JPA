package com.Gnaneswar.OneToOneRelationShip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Gnaneswar.OneToOneRelationShip.model.Employee;
import com.Gnaneswar.OneToOneRelationShip.repository.EmployeeRepo;

@Service
public class EmployeeService {

	
	
	@Autowired
	private EmployeeRepo empRepo;


	public ResponseEntity<Employee> saveEmployee(Employee emp){
		
		Employee employee=empRepo.save(emp);
		return new ResponseEntity<>(employee,HttpStatus.CREATED);
	}
}
