package com.example.healthrecordsystemfinal.controller;

import com.example.healthrecordsystemfinal.entity.FamilyDoctor;
import com.example.healthrecordsystemfinal.service.familyDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class familyDoctorController {

    @Autowired
    private familyDoctorService service;

    @PostMapping("/setfamilydoctordetails")
    public FamilyDoctor familyDoctor(@RequestBody FamilyDoctor familyDoctor) {
        return service.setFamilyDoctor(familyDoctor);
    }
    @PostMapping("/getfamilydoctordetails")
    public List<FamilyDoctor> findAllUsers(){
        return service.getFamilyDoctorDetails();
    }
}
