package com.example.healthrecordsystemfinal.controller;

import com.example.healthrecordsystemfinal.entity.DoctorDetail;
import com.example.healthrecordsystemfinal.service.doctorDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class doctorDetailController {

    @Autowired
    private doctorDetailService service;

    @PostMapping("/doctordetails")
    public DoctorDetail doctorDetail(@RequestBody DoctorDetail doctdetails) {
        return service.setDoctor(doctdetails);
    }

    @PostMapping("/getdoctordetails")
    public List<DoctorDetail> findAllDoctorDetails(){
        return service.getDoctorDetails();
    }
}
