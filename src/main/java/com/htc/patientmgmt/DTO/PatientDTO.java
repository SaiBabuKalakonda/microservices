package com.htc.patientmgmt.DTO;

import java.util.List;

import javax.persistence.Column;

import com.htc.patientmgmt.entity.Disease;

public class PatientDTO {

	private String firstName;
	
	private String lastName;

	private Long emergencyConactNo;

	private List<Disease> diseases;
	
	public PatientDTO() {
		super();
		
	}

	public PatientDTO(String firstName, String lastName, Long emergencyConactNo, List<Disease> diseases) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emergencyConactNo = emergencyConactNo;
		this.diseases = diseases;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getEmergencyConactNo() {
		return emergencyConactNo;
	}

	public void setEmergencyConactNo(Long emergencyConactNo) {
		this.emergencyConactNo = emergencyConactNo;
	}

	public List<Disease> getDiseases() {
		return diseases;
	}

	public void setDiseases(List<Disease> diseases) {
		this.diseases = diseases;
	}

	@Override
	public String toString() {
		return "PatientDTO [firstName=" + firstName + ", lastName=" + lastName + ", emergencyConactNo="
				+ emergencyConactNo + ", diseases=" + diseases + "]";
	}
}
