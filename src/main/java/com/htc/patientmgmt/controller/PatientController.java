package com.htc.patientmgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.patientmgmt.DTO.PatientDTO;
import com.htc.patientmgmt.entity.Patient;
import com.htc.patientmgmt.persistence.IPatient;



@RestController
@RequestMapping("/api")
public class PatientController {
	
	private IPatient repo;
 
@GetMapping("/patients/{patientId}")
Patient getPatient(@PathVariable Long patientId)
{
	Patient pat=null;
	pat=repo.findById(patientId).get();
	return pat;
	
}

@GetMapping("/patients-mobileNo/{mobileNo}")
Patient getPatientByMobileNo(@PathVariable Long mobileNo)
{
	Patient pat=null;
	pat=repo.findById(mobileNo).get();
	return pat;
	
}
@GetMapping("/patients-fistname/{firstName}")
Patient getPatientByFirstName(@PathVariable String firstName)
{
	Patient pat=null;
	pat=repo.findByFirstName(firstName);
	return pat;
	
}

@GetMapping("/patients-lastName/{lastName}")
Patient getPatientByLastName(@PathVariable String lastName)
{
	Patient pat=null;
	pat=repo.findByFirstName(lastName);
	return pat;
	
}


@PostMapping("/patients")
Patient createPatient(@RequestBody PatientDTO pat)
{
	Patient patient=new Patient(pat.getFirstName(),pat.getLastName(),pat.getEmergencyConactNo(),pat.getDiseases());
	return repo.save(patient);
	
}

@GetMapping("/patients")
Patient  findAll() {

  return (Patient) repo.findAll();
}

@DeleteMapping("/patients/{patientId}")
void deletePatient(@PathVariable Long patientId)
{
	 repo.deleteById(patientId);
	
}


@Autowired
public void setRepo(IPatient repo) {
	this.repo = repo;
}
	
	
}
