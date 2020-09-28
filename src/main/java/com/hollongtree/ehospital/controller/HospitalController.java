package com.hollongtree.ehospital.controller;

import com.hollongtree.ehospital.entity.Hospital;
import com.hollongtree.ehospital.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HospitalController {

    @Autowired
    HospitalService hospitalService;

    @GetMapping("/hospital")
    public String test5(Hospital hospital){

        return "hospital";
    }

    @PostMapping("/saveHospital")
    public void saveLocation(@RequestBody Hospital hospital){

        hospitalService.saveHospital(hospital);

    }
}
