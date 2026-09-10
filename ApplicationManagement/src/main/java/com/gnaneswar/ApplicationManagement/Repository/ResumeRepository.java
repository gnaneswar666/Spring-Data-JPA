package com.gnaneswar.ApplicationManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gnaneswar.ApplicationManagement.Entity.Resume;

public interface ResumeRepository extends JpaRepository<Resume, Long>{

	
}
