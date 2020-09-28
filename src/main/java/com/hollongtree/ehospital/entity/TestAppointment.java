package com.hollongtree.ehospital.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TestAppointment")
public class TestAppointment {

    private int TestAppointmentid;

    private Labtest labtest;

    private Date Date;

    private int patientid;

    private String Mobileno;

    private String Email;

    private String PaymentStatus;

    private Double Ammount;

    private String Paymentid;

    private String AppointmentStatus;


    @Id
    @Column(name = "test_appointment_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getTestAppointmentid() {
        return TestAppointmentid;
    }

    public void setTestAppointmentid(int testAppointmentid) {
        TestAppointmentid = testAppointmentid;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name= "lab_test_list_id",nullable=false)
    public Labtest getLabtest() {
        return labtest;
    }

    public void setLabtest(Labtest labtest) {
        this.labtest = labtest;
    }


    @Column(name="date")
    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    @Column(name="patient_id")
    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }

    @Column(name="mobile_no")
    public String getMobileno() {
        return Mobileno;
    }

    public void setMobileno(String mobileno) {
        Mobileno = mobileno;
    }

    @Column(name="email_id")
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Column(name="payment_status")
    public String getPaymentStatus() {
        return PaymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        PaymentStatus = paymentStatus;
    }

    @Column(name="ammount")
    public Double getAmmount() {
        return Ammount;
    }

    public void setAmmount(Double ammount) {
        Ammount = ammount;
    }

    @Column(name="payment_id")
    public String getPaymentid() {
        return Paymentid;
    }

    public void setPaymentid(String paymentid) {
        Paymentid = paymentid;
    }

    @Column(name="appointment_status")
    public String getAppointmentStatus() {
        return AppointmentStatus;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        AppointmentStatus = appointmentStatus;
    }
}
