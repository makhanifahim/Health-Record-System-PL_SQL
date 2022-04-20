package com.example.healthrecordsystemfinal.service;

import com.example.healthrecordsystemfinal.entity.FamilyDoctor;
import com.example.healthrecordsystemfinal.repository.familyDoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class familyDoctorService {

    @Autowired
    private familyDoctorRepository familyDoctorRepository;

    public FamilyDoctor setFamilyDoctor(FamilyDoctor doctls)
    {
        return familyDoctorRepository.save(doctls);
    }
    public List<FamilyDoctor> getFamilyDoctorDetails()
    {
        return familyDoctorRepository.findAll();
    }
}
