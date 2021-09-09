package com.htc.patientmgmt.persistence;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htc.patientmgmt.entity.Patient;


@Repository
public interface IPatient extends JpaRepository<Patient,Long>{

	public Patient findByFirstName(String firstName);
	public Patient findByLastName(String lastName);
	
}