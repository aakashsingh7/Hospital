package com.hollongtree.ehospital.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Prescription")
public class PrescriptionList {

	private String prescriptionid;
	
	private Patient patient;
	
	private String prescriptionheader;
	
	private String uploaddate;
	
	private String diseasename;
	
	private int noofpage;
	
	private int doctordetailsid;
	
	private Set<PrescriptionPage> pages= new HashSet <PrescriptionPage>(0);

	@Id
	@Column(name = "prescription_id")
	public String getPrescriptionid() {
		return prescriptionid;
	}

	public void setPrescriptionid(String prescriptionid) {
		this.prescriptionid = prescriptionid;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name= "patient_id",nullable=false)
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	
	@Column(name="Prescription_header")
	public String getPrescriptionheader() {
		return prescriptionheader;
	}

	

	public void setPrescriptionheader(String prescriptionheader) {
		this.prescriptionheader = prescriptionheader;
	}

	@Column(name="Upload_date")
	public String getUploaddate() {
		return uploaddate;
	}

	public void setUploaddate(String uploaddate) {
		this.uploaddate = uploaddate;
	}

	@Column(name="Disease_name")
	public String getDiseasename() {
		return diseasename;
	}

	public void setDiseasename(String diseasename) {
		this.diseasename = diseasename;
	}
	@Column(name="No_of_page")
	public int getNoofpage() {
		return noofpage;
	}

	public void setNoofpage(int noofpage) {
		this.noofpage = noofpage;
	}

	@Column(name="Doctor_details_id")
	public int getDoctordetailsid() {
		return doctordetailsid;
	}
	

	public void setDoctordetailsid(int doctordetailsid) {
		this.doctordetailsid = doctordetailsid;
	}


	@ManyToMany(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(name="pres_page",joinColumns = {@JoinColumn(name="prescription_id")
	},inverseJoinColumns = { @JoinColumn(name = "page_id")})
	public Set<PrescriptionPage> getPages() {
		return pages;
	}

	public void setPages(Set<PrescriptionPage> pages) {
		this.pages = pages;
	}

	public PrescriptionList() {
		
	}

	

}
