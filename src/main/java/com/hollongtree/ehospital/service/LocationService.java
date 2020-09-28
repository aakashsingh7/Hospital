package com.hollongtree.ehospital.service;

import com.hollongtree.ehospital.Repository.LocationRepository;

import com.hollongtree.ehospital.entity.LocationAnalysis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @Autowired
    LocationRepository locationRepository;

    public void saveLocation(LocationAnalysis location){
        locationRepository.save(location);
    }
}
