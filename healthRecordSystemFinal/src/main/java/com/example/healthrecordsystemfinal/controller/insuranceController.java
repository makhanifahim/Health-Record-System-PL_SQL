package com.example.healthrecordsystemfinal.controller;

import com.example.healthrecordsystemfinal.entity.InsuranceDetail;
import com.example.healthrecordsystemfinal.service.insuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class insuranceController {
    @Autowired
    private insuranceService service;

    @PostMapping("/insurance")
    public InsuranceDetail insurancedet(@RequestBody InsuranceDetail insurancedetail) {
         return service.insurancedetail(insurancedetail);
    }

    @PostMapping("/getinsurancedetails")
    public List<InsuranceDetail> findAllUsers(){
        return service.getDetails();
    }
}