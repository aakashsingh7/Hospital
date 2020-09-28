package com.hollongtree.ehospital.controller;


import com.hollongtree.ehospital.entity.PrescriptionList;
import com.hollongtree.ehospital.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrescriptionController {

    @Autowired
    PrescriptionService prescriptionService;

    @GetMapping("/Prescreption")
    public String test2(PrescriptionList prescription) {

        return "prescription";
    }


    @PostMapping("/savePrescription")
    public void savePrescription(@RequestBody PrescriptionList prescription) {


        prescriptionService.savePrescription(prescription);
    }
}