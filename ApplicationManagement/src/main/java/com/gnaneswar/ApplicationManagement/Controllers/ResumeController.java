package com.gnaneswar.ApplicationManagement.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gnaneswar.ApplicationManagement.Entity.Resume;
import com.gnaneswar.ApplicationManagement.Service.ResumeService;

@RestController
@RequestMapping("/api/resume")
public class ResumeController {

	@Autowired
	ResumeService resumeService;
	
	@PostMapping("/{id}")
	public ResponseEntity<String> addResume(@RequestBody Resume resume,@PathVariable Long id){
		
		return resumeService.addResume(id, resume);
	}
	
	
	
}
