package com.hollongtree.ehospital.controller;

import com.hollongtree.ehospital.entity.Hospital;
import com.hollongtree.ehospital.entity.TestReport;
import com.hollongtree.ehospital.service.TestReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestReportController {

    @Autowired
    TestReportService testReportService;

    @GetMapping("/testReport")
    public String test7(TestReport testReport){

        return "testReport";
    }

    @PostMapping("/savetestReport")
    public void saveTestReport(@RequestBody TestReport testReport){

        testReportService.saveTestReport(testReport);

    }
}