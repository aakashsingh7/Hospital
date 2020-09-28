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
@Table(name="login_history")
public class LoginHistory {
	
   private int loginhistoryid;
	
	private Set<Patient> patient= new HashSet<>(0);
	
	private String logintime;
	
	private String logouttime;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="login_id")
	public int getLoginhistoryid() {
		return loginhistoryid;
	}

	public void setLoginhistoryid(int loginhistoryid) {
		this.loginhistoryid = loginhistoryid;
	}

	@ManyToMany(fetch= FetchType.LAZY, mappedBy="login")
	public Set<Patient> getPatient() {
		return patient;
	}

	public void setPatient(Set<Patient> patient) {
		this.patient = patient;
	}

	@Column(name="login_time", nullable=false)
	public String getLogintime() {
		return logintime;
	}

	public void setLogintime(String logintime) {
		this.logintime = logintime;
	}

	

	@Column(name="logout_time", nullable=false)
	public String getLogouttime() {
		return logouttime;
	}

	public void setLogouttime(String logouttime) {
		this.logouttime = logouttime;
	}

	
	

}
