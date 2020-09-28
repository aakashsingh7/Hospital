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
@Table(name = "page")
public class PrescriptionPage {
	private int pageid;
	
	private String pagepath;
	
	private Set<PrescriptionList> prescriptionset = new HashSet<PrescriptionList>(0);

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="page_id", unique= true, nullable =false)
	public int getPageid() {
		return pageid;
	}

	public void setPageid(int pageid) {
		this.pageid = pageid;
	}

	@Column(name="page_path", nullable=false)
	public String getPagepath() {
		return pagepath;
	}

	public void setPagepath(String pagepath) {
		this.pagepath = pagepath;
	}
	
	@ManyToMany(fetch= FetchType.LAZY, mappedBy="pages")
	public Set<PrescriptionList> getPrescriptionset() {
		return prescriptionset;
	}

	public void setPrescriptionset(Set<PrescriptionList> prescriptionset) {
		this.prescriptionset = prescriptionset;
	}

	

}
