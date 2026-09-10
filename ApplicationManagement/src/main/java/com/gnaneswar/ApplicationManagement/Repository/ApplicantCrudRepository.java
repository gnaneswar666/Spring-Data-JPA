package com.gnaneswar.ApplicationManagement.Repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.gnaneswar.ApplicationManagement.Entity.Applicant;

@Repository
public interface ApplicantCrudRepository extends ListCrudRepository<Applicant, Long>{
	
	//here  CrudRepository return in iterable format for some methods
	// to overcome this ListCrudRepository is  introduced
	
}