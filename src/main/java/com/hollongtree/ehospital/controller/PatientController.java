package com.hollongtree.ehospital.controller;


import com.hollongtree.ehospital.entity.Patient;
import com.hollongtree.ehospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController {

    @Autowired
    PatientService patientService;

    @GetMapping("/test")
    public String test(Patient patient){

       return "PATIENT";
    }



    @PostMapping ("/savePatient")
    public void savePatient(@RequestBody Patient patient){


        patientService.savePatient(patient);


    }
}
