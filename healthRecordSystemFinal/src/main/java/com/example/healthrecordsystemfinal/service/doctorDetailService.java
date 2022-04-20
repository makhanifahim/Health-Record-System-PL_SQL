package com.example.healthrecordsystemfinal.service;

import com.example.healthrecordsystemfinal.entity.DoctorDetail;
import com.example.healthrecordsystemfinal.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class doctorDetailService {

    @Autowired
    private doctorDetailRepository doctorRepository;
    @Autowired
    private userRepository userRepository;
    @Autowired
    private registerRepository registerRepos;
    @Autowired
    private addressRepository addressR;
    @Autowired
    private userTypeRepository userTypeReposit;

    public DoctorDetail setDoctor(DoctorDetail doctls)
    {
        addressR.save(doctls.getUser().getPerson().getAddress());
        registerRepos.save(doctls.getUser().getPerson());
        userRepository.save(doctls.getUser());
        return doctorRepository.save(doctls);
    }
    public List<DoctorDetail> getDoctorDetails()
    {
        return doctorRepository.findAll();
    }
}
