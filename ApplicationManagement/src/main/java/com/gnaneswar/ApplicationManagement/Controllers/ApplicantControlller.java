package com.gnaneswar.ApplicationManagement.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gnaneswar.ApplicationManagement.Entity.APIResponse;
import com.gnaneswar.ApplicationManagement.Entity.Applicant;
import com.gnaneswar.ApplicationManagement.Service.ApplicantService;

@RestController
@RequestMapping("/api/applicants")
public class ApplicantControlller {

	@Autowired
	ApplicantService applicantService;
	
	@GetMapping
	public APIResponse<List<Applicant>> getAllApplicants(){
		return applicantService.getAlApplicants();
	}
	@PostMapping
	public Applicant addApplicant(@RequestBody Applicant applicant) {
		return applicantService.saveApplicant(applicant);
	}
	
	@PostMapping("/All")
	public List<Applicant> addApplicant(@RequestBody List<Applicant> applicant) {
		return applicantService.saveApplicant(applicant);
	}
	@GetMapping("/page")
	public Iterable<Applicant> getApplicationWithPagignation(@RequestParam int page,@RequestParam int size ){
		return applicantService.getApplicationWithPagignation(page, size);
	}
	
//	@GetMapping("/{status}")
//	public List<Applicant> getByStatus(@PathVariable String status){
//		return applicantService.getApplicantsByStatus(status);
//	}
	
	@GetMapping("/{field}")
	public APIResponse<List<Applicant>> findByStatus(@PathVariable String field){
		return applicantService.getApplicantsByField(field);
		
	}
	@GetMapping("/applicant/{name}")
	public List<Applicant> getByPartialName(@PathVariable String name){
		
		return applicantService.getApplicantByPartialName(name);
	}
	
	
	//pagignation 
	@GetMapping("/pagignation/{offset}/{size}")
	public APIResponse<Page<Applicant>> findByPagignation(@PathVariable int offset, @PathVariable int  size){
		return applicantService.findByPagignation(offset, size);
	}
	
	
	//pagignatio and sorting
	@GetMapping("/pagignationAndSort/{offset}/{size}/{field}")
	public APIResponse<Page<Applicant>> findByPagignation(@PathVariable int offset, @PathVariable int  size,@PathVariable String field){
		return applicantService.findByPagignationwithsorting(offset, size,field);
	}
	
}
