package com.hollongtree.ehospital.service;


import com.hollongtree.ehospital.Repository.PrescriptionRepository;
import com.hollongtree.ehospital.entity.PrescriptionList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrescriptionService {

    @Autowired
    PrescriptionRepository prescriptionRepository;

    public void savePrescription(PrescriptionList prescription)
    {
        prescriptionRepository.save(prescription);
    }
}
