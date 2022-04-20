package com.example.healthrecordsystemfinal.service;

import com.example.healthrecordsystemfinal.entity.Hospital;
import com.example.healthrecordsystemfinal.repository.addressRepository;
import com.example.healthrecordsystemfinal.repository.hospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class hospitalService {

    @Autowired
    private hospitalRepository hospRepository;
    @Autowired
    private addressRepository addressRepository;

    public Hospital setHospital(Hospital hos)
    {
        addressRepository.save(hos.getAddress());
        return hospRepository.save(hos);
    }
    public List<Hospital> getHospital()
    {
        return hospRepository.findAll();
    }
}
