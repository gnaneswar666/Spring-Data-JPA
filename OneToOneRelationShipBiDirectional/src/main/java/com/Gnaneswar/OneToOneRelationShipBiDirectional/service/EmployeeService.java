package com.Gnaneswar.OneToOneRelationShipBiDirectional.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Gnaneswar.OneToOneRelationShipBiDirectional.model.Employee;
import com.Gnaneswar.OneToOneRelationShipBiDirectional.repository.EmployeeRepo;

@Service
public class EmployeeService {

	
	
	@Autowired
	private EmployeeRepo empRepo;


	public ResponseEntity<Employee> saveEmployee(Employee emp){
		
		Employee employee=empRepo.save(emp);
		return new ResponseEntity<>(employee,HttpStatus.CREATED);
	}
}
