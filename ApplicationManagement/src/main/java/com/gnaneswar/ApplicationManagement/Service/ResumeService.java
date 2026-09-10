package com.gnaneswar.ApplicationManagement.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.gnaneswar.ApplicationManagement.Entity.Applicant;
import com.gnaneswar.ApplicationManagement.Entity.Resume;
import com.gnaneswar.ApplicationManagement.Repository.ApplicantJPARepository;
import com.gnaneswar.ApplicationManagement.Repository.ResumeRepository;

@Service
public class ResumeService {

	@Autowired
	private ApplicantJPARepository ApplicantJpaRepo;
	
	@Autowired
	ResumeRepository resumeRepo;
	
	public ResponseEntity<String> addResume(Long id ,Resume resume) {
	
		Optional<Applicant> applicant=ApplicantJpaRepo.findById(id);
		if(applicant.isPresent()) {
			Applicant appl=applicant.get();
			resume.setApplicant(appl);
			 resumeRepo.save(resume);
			 return new ResponseEntity<String>("added", HttpStatus.CREATED);
			
		}
		else {
			 return new ResponseEntity<String>("application not found see once again ", HttpStatus.NOT_FOUND);		}
		
	}
}
