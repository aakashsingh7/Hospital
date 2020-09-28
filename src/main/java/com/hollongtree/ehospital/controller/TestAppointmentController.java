package com.hollongtree.ehospital.controller;

import com.hollongtree.ehospital.Repository.TestAppointmentRepository;
import com.hollongtree.ehospital.entity.Hospital;
import com.hollongtree.ehospital.entity.TestAppointment;
import com.hollongtree.ehospital.service.TestAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAppointmentController {

    @Autowired
    TestAppointmentService testAppointmentService;

    @GetMapping("/testAppointment")
    public String test6(TestAppointment testAppointment){

        return "testAppointment";
    }

    @PostMapping("/saveTestAppointment")
    public void saveTestAppointment(@RequestBody TestAppointment testAppointment){

        testAppointmentService.saveTestAppointment(testAppointment);

    }
}