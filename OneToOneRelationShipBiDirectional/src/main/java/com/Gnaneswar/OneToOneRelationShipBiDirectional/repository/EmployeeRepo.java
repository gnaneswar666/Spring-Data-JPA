package com.Gnaneswar.OneToOneRelationShipBiDirectional.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Gnaneswar.OneToOneRelationShipBiDirectional.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
