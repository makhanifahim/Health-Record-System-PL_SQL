package com.example.healthrecordsystemfinal.controller;

import com.example.healthrecordsystemfinal.entity.Report;
import com.example.healthrecordsystemfinal.repository.reportRepository;
import com.example.healthrecordsystemfinal.service.reportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class reportController {

    @Autowired
    public reportRepository repository;

    @Autowired
    public reportService reportSer;

    @PostMapping("/reportdetails")
    public int reportSaving(@RequestBody Report report) {
        Report rs=repository.save(report);
        return rs.getId();
    }
    @PostMapping("/getallreports")
    public List<Report> findAllUsers(){
        return reportSer.getDetails();
    }

    @PostMapping("/getallreportsbyuserid/{id}")
    public List<Report> findAllUsersById(@PathVariable int id)
    {
        return reportSer.getReportsByUserId(id);

    }
    @DeleteMapping("/deletereport/{id}")
    public String deleteReport(@PathVariable int id)
    {
        return reportSer.deleteReport(id);
    }
    @PutMapping("/updatereport")
    public Report updateProduct(@RequestBody Report report){
        return reportSer.updateReport(report);
    }
}
