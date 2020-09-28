package com.hollongtree.ehospital.controller;

import com.hollongtree.ehospital.entity.PrescriptionPage;
import com.hollongtree.ehospital.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {


    @Autowired
    PageService pageService;

    @GetMapping("/page")
    public String test4(PrescriptionPage page){

        return "page";
    }

    @PostMapping("/savePage")
    public void savePage(@RequestBody PrescriptionPage page){

        pageService.savePage(page);

    }
}
