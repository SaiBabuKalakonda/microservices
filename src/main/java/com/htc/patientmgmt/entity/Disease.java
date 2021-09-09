package com.htc.patientmgmt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Disease implements Serializable {

	private static final long serialVersionUID = 5020318171872111095L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long diseaseId;
	@Column
	private long patientId;
	@Column
	private String diseaseName;
	@Column
	private String healthstatus;
	public Disease() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Disease(long patientId, String diseaseName, String healthstatus) {
		super();
		this.patientId = patientId;
		this.diseaseName = diseaseName;
		this.healthstatus = healthstatus;
	}
	public Long getDiseaseId() {
		return diseaseId;
	}
	public void setDiseaseId(Long diseaseId) {
		this.diseaseId = diseaseId;
	}
	public long getPatientId() {
		return patientId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	public String getDiseaseName() {
		return diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}
	public String getHealthstatus() {
		return healthstatus;
	}
	public void setHealthstatus(String healthstatus) {
		this.healthstatus = healthstatus;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diseaseId == null) ? 0 : diseaseId.hashCode());
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
		Disease other = (Disease) obj;
		if (diseaseId == null) {
			if (other.diseaseId != null)
				return false;
		} else if (!diseaseId.equals(other.diseaseId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Disease [diseaseId=" + diseaseId + ", patientId=" + patientId + ", diseaseName=" + diseaseName
				+ ", healthstatus=" + healthstatus + "]";
	}
}
