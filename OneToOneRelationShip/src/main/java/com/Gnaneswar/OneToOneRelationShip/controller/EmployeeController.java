package com.Gnaneswar.OneToOneRelationShip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Gnaneswar.OneToOneRelationShip.model.Employee;
import com.Gnaneswar.OneToOneRelationShip.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	
	@Autowired
	private EmployeeService empService;
	
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp){
		return empService.saveEmployee(emp);
	}
}
