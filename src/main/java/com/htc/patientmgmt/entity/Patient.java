package com.htc.patientmgmt.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Patient")
public class Patient implements Serializable {
	
	
	private static final long serialVersionUID = 7416348549565195269L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long patientId;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private Long emergencyConactNo;
	@Column
	private List<Disease> diseases;
	
	public Patient() {
		super();
	}

	public Patient(String firstName, String lastName, Long mobileNo, List<Disease> diseases) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emergencyConactNo = mobileNo;
		this.diseases = diseases;
		
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
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

	public Long getMobileNo() {
		return emergencyConactNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.emergencyConactNo = mobileNo;
	}

	public List<Disease> getDiseases() {
		return diseases;
	}

	public void setDiseases(List<Disease> diseases) {
		this.diseases = diseases;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (patientId == null) {
			if (other.patientId != null)
				return false;
		} else if (!patientId.equals(other.patientId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Patient details [patientId=" + patientId + ", firstName=" + firstName + ", lastName=" + lastName + ", mobileNo="
				+ emergencyConactNo + ", diseases=" + diseases + "]";
	}
	
}