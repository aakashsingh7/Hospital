package com.hollongtree.ehospital.service;

import com.hollongtree.ehospital.Repository.HospitalRepository;
import com.hollongtree.ehospital.entity.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalService {

    @Autowired
    HospitalRepository hospitalRepository;

    public void saveHospital(Hospital hospital){
        hospitalRepository.save(hospital);
    }
}
