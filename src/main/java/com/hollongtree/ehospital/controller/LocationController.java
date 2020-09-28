package com.hollongtree.ehospital.controller;


import com.hollongtree.ehospital.entity.LocationAnalysis;
import com.hollongtree.ehospital.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {

    @Autowired
    LocationService locationService;

    @GetMapping("/location")
    public String test4(LocationAnalysis location){

        return "location";
    }

    @PostMapping("/saveLocation")
    public void saveLocation(@RequestBody LocationAnalysis location){

        locationService.saveLocation(location);

    }
}
