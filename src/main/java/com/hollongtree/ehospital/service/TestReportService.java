package com.hollongtree.ehospital.service;


import com.hollongtree.ehospital.Repository.TestReportRepository;
import com.hollongtree.ehospital.entity.TestReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestReportService {

    @Autowired
    TestReportRepository testReportRepository;

    public void saveTestReport(TestReport testReport){
        testReportRepository.save(testReport);
    }


}
