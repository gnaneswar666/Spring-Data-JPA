package com.gnaneswar.ApplicationManagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gnaneswar.ApplicationManagement.Entity.Applicant;

public interface ApplicantJPARepository extends JpaRepository<Applicant, Long>{

	List<Applicant> getByStatus(String status);

	List<Applicant> getByStatusOrderByName(String status);
	
	List<Applicant> getByStatusOrderByEmail(String status);

	
	@Query("select a from Applicant a where  a.name like %?1%")
	public List<Applicant> getApplicantByPartialName( String name);



	
}
