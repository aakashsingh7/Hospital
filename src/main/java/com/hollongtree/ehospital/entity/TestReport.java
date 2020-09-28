package com.hollongtree.ehospital.entity;

import javax.persistence.*;

@Entity
@Table(name = "TestReport")
public class TestReport {

    private int TestReportid;

    private String TestReportName;

    private int TestAppointmentid;

    private Patient patient;

    private String udf1;

    private String udf2;

    private String udf3;

    private String udf4;

    private String udf5;

    private String udf6;

    private String udf7;

    private String udf8;

    private String udf9;

    private String udf10;


    @Id
    @Column(name = "test_report_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getTestReportid() {
        return TestReportid;
    }

    public void setTestReportid(int testReportid) {
        TestReportid = testReportid;
    }

    @Column(name="test_report_name")
    public String getTestReportName() {
        return TestReportName;
    }

    public void setTestReportName(String testReportName) {
        TestReportName = testReportName;
    }

    @Column(name="test_Appointment_id")
    public int getTestAppointmentid() {
        return TestAppointmentid;
    }

    public void setTestAppointmentid(int testAppointmentid) {
        TestAppointmentid = testAppointmentid;
    }


    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name= "patient_id",nullable=false)
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Column(name="udf_1")
    public String getUdf1() {
        return udf1;
    }

    public void setUdf1(String udf1) {
        this.udf1 = udf1;
    }

    @Column(name="udf_2")
    public String getUdf2() {
        return udf2;
    }

    public void setUdf2(String udf2) {
        this.udf2 = udf2;
    }

    @Column(name="udf_3")
    public String getUdf3() {
        return udf3;
    }

    public void setUdf3(String udf3) {
        this.udf3 = udf3;
    }

    @Column(name="udf_4")
    public String getUdf4() {
        return udf4;
    }

    public void setUdf4(String udf4) {
        this.udf4 = udf4;
    }

    @Column(name="udf_5")
    public String getUdf5() {
        return udf5;
    }

    public void setUdf5(String udf5) {
        this.udf5 = udf5;
    }

    @Column(name="udf_6")
    public String getUdf6() {
        return udf6;
    }

    public void setUdf6(String udf6) {
        this.udf6 = udf6;
    }

    @Column(name="udf_7")
    public String getUdf7() {
        return udf7;
    }

    public void setUdf7(String udf7) {
        this.udf7 = udf7;
    }

    @Column(name="udf_8")
    public String getUdf8() {
        return udf8;
    }

    public void setUdf8(String udf8) {
        this.udf8 = udf8;
    }

    @Column(name="udf_9")
    public String getUdf9() {
        return udf9;
    }

    public void setUdf9(String udf9) {
        this.udf9 = udf9;
    }

    @Column(name="udf_10")
    public String getUdf10() {
        return udf10;
    }

    public void setUdf10(String udf10) {
        this.udf10 = udf10;
    }
}
