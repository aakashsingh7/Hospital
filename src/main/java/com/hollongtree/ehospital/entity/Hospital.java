package com.hollongtree.ehospital.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Hospital")
public class Hospital {

    private int hospitalid;

    private int hospitalname;

    private Set<Labtest> labtests = new HashSet<Labtest>(0);

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "hospital_id")
    public int getHospitalid() {
        return hospitalid;
    }

    public void setHospitalid(int hospitalid) {
        this.hospitalid = hospitalid;
    }

    @Column(name="hospital_name")
    public int getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(int hospitalname) {
        this.hospitalname = hospitalname;
    }

    @OneToMany(fetch=FetchType.LAZY, mappedBy= "hospital")
    public Set<Labtest> getLabtests() {
        return labtests;
    }

    public void setLabtests(Set<Labtest> labtests) {
        this.labtests = labtests;
    }





}

