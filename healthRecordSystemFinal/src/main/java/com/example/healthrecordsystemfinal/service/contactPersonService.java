package com.example.healthrecordsystemfinal.service;

import com.example.healthrecordsystemfinal.entity.ContactPersonDetail;
import com.example.healthrecordsystemfinal.repository.contactPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class contactPersonService {

    @Autowired
    private contactPersonRepository contactPersonRepository;

    public ContactPersonDetail contactPersonDetail(ContactPersonDetail cpd)
    {
        return contactPersonRepository.save(cpd);
       // return "in";
    }
    public List<ContactPersonDetail> getDetails()
    {
        return contactPersonRepository.findAll();
    }
}
