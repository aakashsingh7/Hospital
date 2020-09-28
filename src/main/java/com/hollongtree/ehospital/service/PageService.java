package com.hollongtree.ehospital.service;


import com.hollongtree.ehospital.Repository.PageRepository;
import com.hollongtree.ehospital.entity.PrescriptionPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PageService {

    @Autowired
    PageRepository pageRepository;

    public void savePage(PrescriptionPage page){
        pageRepository.save(page);
    }


}
