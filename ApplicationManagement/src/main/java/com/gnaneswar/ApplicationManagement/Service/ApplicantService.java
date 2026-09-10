package com.gnaneswar.ApplicationManagement.Service;

import java.util.List;

import  org.springframework.data.domain.Page; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.gnaneswar.ApplicationManagement.Entity.APIResponse;
import com.gnaneswar.ApplicationManagement.Entity.Applicant;
import com.gnaneswar.ApplicationManagement.Repository.ApplicantCrudRepository;
import com.gnaneswar.ApplicationManagement.Repository.ApplicantJPARepository;
import com.gnaneswar.ApplicationManagement.Repository.ApplicantPagingAndSortiingRepository;

@Service
public class ApplicantService {

	@Autowired
	ApplicantCrudRepository crudRepo;
	
	@Autowired
	ApplicantPagingAndSortiingRepository PagingAndSortingRepo;
	
	@Autowired
	ApplicantJPARepository jpaRepo;
	
	public APIResponse<List<Applicant>> getAlApplicants() {
		// TODO Auto-generated method stub
//		Iterable<Applicant> it= crudRepo.findAll();
//		List<Applicant> apl=new ArrayList<>();
//		it.forEach(apl::add);
//		return  apl;
		List<Applicant> list=crudRepo.findAll();
		return new APIResponse(list.size(),list);
	}
	public Applicant saveApplicant(Applicant applicant) {
		// TODO Auto-generated method stub
		return crudRepo.save(applicant);
	}
	public Iterable<Applicant> getApplicationWithPagignation(int page,int size){
		//how much size for each page
		return PagingAndSortingRepo.findAll(PageRequest.of(page, size));
	}
	public List<Applicant> getApplicantsByStatus(String status ){
		return jpaRepo.getByStatus(status);
	}
	public List<Applicant> getApplicantByPartialName(String name)
	{
		return jpaRepo.getApplicantByPartialName(name);
	}
	public List<Applicant> saveApplicant(List<Applicant> applicant) {
		// TODO Auto-generated method stub
		return crudRepo.saveAll(applicant);
	}
	
	public APIResponse<List<Applicant>> getApplicantsByField(String field) {
			List<Applicant> list=jpaRepo.findAll(Sort.by(Sort.Direction.ASC,field));
			return new APIResponse<>(list.size(),list);
		}
	//pagignation	
	public APIResponse<Page<Applicant>> findByPagignation(int offset ,int pageSize){
		
		Page<Applicant> page= jpaRepo.findAll(PageRequest.of(offset, pageSize));
		return new APIResponse<>(page.getSize(),page);
	}	
	//pagingnation and sorting 
public APIResponse<Page<Applicant>> findByPagignationwithsorting(int offset ,int pageSize,String field){
		
		Page<Applicant> page= jpaRepo.findAll(PageRequest.of(offset, pageSize).withSort(Sort.Direction.DESC, field));
		return new APIResponse<>(page.getSize(),page);
	}
}
