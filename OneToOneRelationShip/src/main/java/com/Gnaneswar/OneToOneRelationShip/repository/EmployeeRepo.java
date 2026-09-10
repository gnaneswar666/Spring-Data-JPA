package com.Gnaneswar.OneToOneRelationShip.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Gnaneswar.OneToOneRelationShip.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
