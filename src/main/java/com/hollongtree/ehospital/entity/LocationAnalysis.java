package com.hollongtree.ehospital.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="location")
public class LocationAnalysis {
	
	private int locationid;
	private Set<Patient> patientid= new HashSet<>(0);
	private String location;
	private String longitude;
	private String altitude;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Location_id",nullable=false)
	public int getLocationid() {
		return locationid;
	}
	public void setLocationid(int locationid) {
		this.locationid = locationid;
	}
	@ManyToMany(fetch= FetchType.LAZY, mappedBy="location")
	public Set<Patient> getPatientid() {
		return patientid;
	}

	public void setPatientid(Set<Patient> patientid) {
		this.patientid = patientid;
	}
	
	@Column(name="location",nullable=false)
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Column(name="longitude",nullable=false)
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	@Column(name="altitude",nullable=false)
	public String getAltitude() {
		return altitude;
	}
	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}
	
	
	
	

}
