package com.example.healthrecordsystemfinal.service;

import com.example.healthrecordsystemfinal.entity.InsuranceDetail;
import com.example.healthrecordsystemfinal.repository.insuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class insuranceService {

    @Autowired
    private insuranceRepository insurancedetailRepository;

    public InsuranceDetail insurancedetail(InsuranceDetail ins)
    {
         return insurancedetailRepository.save(ins);
    }
    public List<InsuranceDetail> getDetails()
    {
        return insurancedetailRepository.findAll();
    }
}
