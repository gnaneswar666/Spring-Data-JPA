package com.gnaneswar.ApplicationManagement.Repository;

import org.springframework.data.repository.ListPagingAndSortingRepository;

import com.gnaneswar.ApplicationManagement.Entity.Applicant;

public interface ApplicantPagingAndSortiingRepository extends ListPagingAndSortingRepository<Applicant, Long> {

	//here  PagingAndSortiingRepository return in iterable format for some methods
		// to overcome this ListPagingAndSortiing is  introduced
		
	//List Paging and sorting has only one method 
	//which accepts only sort  so for
	//pagignation we can't do anything
	
}
