package com.hollongtree.ehospital.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "Labtest")
public class Labtest {

    private int labtestid;

    private int labtestname;

    private Hospital hospital;


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "labtest_id")
    public int getLabtestid() {
        return labtestid;
    }

    public void setLabtestid(int labtestid) {
        this.labtestid = labtestid;
    }

    @Column(name="labtest_name")
    public int getLabtestname() {
        return labtestname;
    }

    public void setLabtestname(int labtestname) {
        this.labtestname = labtestname;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name= "hospital_id",nullable=false)
    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }



}



