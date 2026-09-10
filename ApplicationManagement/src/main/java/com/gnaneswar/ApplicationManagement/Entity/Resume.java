package com.gnaneswar.ApplicationManagement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Resume {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String content;
	
	
	// here we are performing the foreign key operation and setting name as applicant id
	//for that column when we store the Applicant
	//nullable false means it cannot be null
	
	@OneToOne
	@JoinColumn(name="applicantId",nullable=false)
	private Applicant applicant;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Applicant getApplicant() {
		return applicant;
	}


	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}
	
	
}
