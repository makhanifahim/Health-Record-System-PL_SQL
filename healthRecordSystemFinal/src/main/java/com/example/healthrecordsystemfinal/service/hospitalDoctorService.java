package com.example.healthrecordsystemfinal.service;

import com.example.healthrecordsystemfinal.entity.HospitalDoctor;
import com.example.healthrecordsystemfinal.repository.hospitalDoctorRepository;
import com.example.healthrecordsystemfinal.repository.hospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class hospitalDoctorService {

    @Autowired
    private hospitalDoctorRepository hospitaldoctorRepository;

    @Autowired
    private hospitalRepository hospitalReposit;


    public HospitalDoctor setHospitalDoctor(HospitalDoctor hos)
    {
        hospitalReposit.save(hos.getHospital());
        return hospitaldoctorRepository.save(hos);
    }
    public List<HospitalDoctor> getHospitalDoctorDetails()
    {
        return hospitaldoctorRepository.findAll();
    }
}