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
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "PATIENT")
public class Patient {
	
	
    private String patientid;
	
	private String patientname;
	
	private String patientmobile;
	
	private String govthealthid;
	
	private int age;
	
	private String address1;
	
	private String address2;
	
	private String address3;
	
	private String address4;
	
	private String address5;
	
	private String dateofbirth;
	
	private String gender;
	
	private int weight;
	
	private String weighttype;
	
	private int height;
	
	private String heighttype;
	
	private String udf1;
	
	private String udf2;
	
	private String udf3;
	
	private String udf4;
	
	private String udf5;
	
	private Set<PrescriptionList> prescriptions = new HashSet<PrescriptionList>(0);
	
    private Set<LoginHistory> login = new HashSet<LoginHistory>(0);
	
	private Set<LocationAnalysis> location= new HashSet<LocationAnalysis>(0);

	//private Set<TestAppointment> testAppointment= new HashSet<TestAppointment>(0);

	private Set<TestReport> testReport= new HashSet<TestReport>(0);


	
	
	
	@Id
	@Column(name = "patient_id")
	public String getPatientid() {
		return patientid;
	}

	public void setPatientid(String patientid) {
		this.patientid = patientid;
	}

	@Column(name = "patient_name", nullable = false, length = 100)
	public String getPatientname() {
		return patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	@Column(name = "patient_mobile", nullable = false, length = 100)
	public String getPatientmobile() {
		return patientmobile;
	}

	public void setPatientmobile(String patientmobile) {
		this.patientmobile = patientmobile;
	}

	@Column(name = "govthealthid",  length = 100)
	public String getGovthealthid() {
		return govthealthid;
	}

	public void setGovthealthid(String govthealthid) {
		this.govthealthid = govthealthid;
	}

	@Column(name = "age", nullable = false, length = 100)

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Column(name = "address1", length = 100)
	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	@Column(name = "address2", length = 100)
	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	@Column(name = "address3",  length = 100)
	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	@Column(name = "address4", length = 100)
	public String getAddress4() {
		return address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	@Column(name = "address5", length = 100)
	public String getAddress5() {
		return address5;
	}

	public void setAddress5(String address5) {
		this.address5 = address5;
	}

	@Column(name = "Date_of_birth", nullable = false, length = 100)
	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	@Column(name = "gender", nullable = false, length = 100)
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "weight", nullable = false, length = 100)
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Column(name = "weight_type", nullable = false, length = 100)
	public String getWeighttype() {
		return weighttype;
	}

	public void setWeighttype(String weighttype) {
		this.weighttype = weighttype;
	}

	@Column(name = "height", nullable = false, length = 100)
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Column(name = "height_type", nullable = false, length = 100)
	public String getHeighttype() {
		return heighttype;
	}

	public void setHeighttype(String heighttype) {
		this.heighttype = heighttype;
	}

	@Column(name = "udf1",  length = 100)
	public String getUdf1() {
		return udf1;
	}

	public void setUdf1(String udf1) {
		this.udf1 = udf1;
	}

	@Column(name = "udf2", length = 100)
	public String getUdf2() {
		return udf2;
	}

	public void setUdf2(String udf2) {
		this.udf2 = udf2;
	}

	@Column(name = "udf3",  length = 100)
	public String getUdf3() {
		return udf3;
	}

	public void setUdf3(String udf3) {
		this.udf3 = udf3;
	}

	@Column(name = "udf4",  length = 100)
	public String getUdf4() {
		return udf4;
	}

	public void setUdf4(String udf4) {
		this.udf4 = udf4;
	}

	@Column(name = "udf5",  length = 100)
	public String getUdf5() {
		return udf5;
	}

	public void setUdf5(String udf5) {
		this.udf5 = udf5;
	}



	@OneToMany(fetch=FetchType.LAZY, mappedBy= "patient")
	public Set<PrescriptionList> getPrescriptions() {
		return prescriptions;
	}

	public void setPrescriptions(Set<PrescriptionList> prescriptions) {
		this.prescriptions = prescriptions;
	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Patient_Login", joinColumns =
   { @JoinColumn(name = "patient_id") },
   inverseJoinColumns = { @JoinColumn(name = "login_id") })
	public Set<LoginHistory> getLogin() {
		return login;
	}

	public void setLogin(Set<LoginHistory> login) {
		this.login = login;
	}
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Patient_Location", joinColumns =
   { @JoinColumn(name = "patient_id") },
   inverseJoinColumns = { @JoinColumn(name = "Location_ID") })
	public Set<LocationAnalysis> getLocation() {
		return location;
	}

	public void setLocation(Set<LocationAnalysis> location) {
		this.location = location;
	}


//	@OneToMany(fetch=FetchType.LAZY, mappedBy= "patient")
//	public Set<TestAppointment> getTestAppointmentest() {
//		return testAppointment;
//	}
//
//	public void setTestAppointment(Set<TestAppointment> testReport) {
//		this.testAppointment = testAppointment;
//	}



	@OneToMany(fetch=FetchType.LAZY, mappedBy= "patient")
	public Set<TestReport> getTestReport() {
		return testReport;
	}

	public void setTestReport(Set<TestReport> testReport) {
		this.testReport = testReport;
	}


}
