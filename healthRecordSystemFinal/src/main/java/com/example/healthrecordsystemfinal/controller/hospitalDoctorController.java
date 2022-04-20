package com.example.healthrecordsystemfinal.controller;

import com.example.healthrecordsystemfinal.entity.HospitalDoctor;
import com.example.healthrecordsystemfinal.service.hospitalDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class hospitalDoctorController {
    @Autowired
    private hospitalDoctorService service;

    @PostMapping("/sethospitaldoctordetails")
    public HospitalDoctor getHospitalDoctorDetails(@RequestBody HospitalDoctor hospitalDoctor) {
        return service.setHospitalDoctor(hospitalDoctor);
    }
    @PostMapping("/gethospitaldoctordetails")
    public List<HospitalDoctor> findAllHospital(){
        return service.getHospitalDoctorDetails();
    }
}
