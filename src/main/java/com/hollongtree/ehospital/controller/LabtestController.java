package com.hollongtree.ehospital.controller;

import com.hollongtree.ehospital.entity.Hospital;
import com.hollongtree.ehospital.entity.Labtest;
import com.hollongtree.ehospital.service.LabtestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LabtestController {

    @Autowired
    LabtestService labtestService;

    @GetMapping("/labtest")
    public String test6(Labtest labtest) {

        return "labtest";
    }

    @PostMapping("/saveLabtest")
    public void saveLocation(@RequestBody Labtest labtest) {

        labtestService.saveLabtest(labtest);
    }
}
