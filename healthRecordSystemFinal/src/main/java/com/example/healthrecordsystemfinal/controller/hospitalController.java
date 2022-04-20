package com.example.healthrecordsystemfinal.controller;

import com.example.healthrecordsystemfinal.entity.Hospital;
import com.example.healthrecordsystemfinal.service.hospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class hospitalController {
    @Autowired
    private hospitalService service;

    @PostMapping("/sethospital")
    public Hospital getHospitalDetails(@RequestBody Hospital hospital) {
        return service.setHospital(hospital);
    }

    @PostMapping("/gethospitaldetails")
    public List<Hospital> findAllHospital(){
        return service.getHospital();
    }
}
