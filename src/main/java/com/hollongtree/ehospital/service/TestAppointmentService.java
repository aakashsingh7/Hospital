package com.hollongtree.ehospital.service;

import com.hollongtree.ehospital.Repository.TestAppointmentRepository;
import com.hollongtree.ehospital.entity.TestAppointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestAppointmentService {

    @Autowired
    TestAppointmentRepository testAppointmentRepository;

    public void saveTestAppointment(TestAppointment testAppointment){

        testAppointmentRepository.save(testAppointment);
    }
}
