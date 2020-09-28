package com.hollongtree.ehospital.service;

import com.hollongtree.ehospital.Repository.LabtestRepository;
import com.hollongtree.ehospital.entity.Labtest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LabtestService {

    @Autowired
    LabtestRepository labtestRepository;

    public void saveLabtest(Labtest labtest){
        labtestRepository.save(labtest);
    }
}
