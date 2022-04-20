package com.example.healthrecordsystemfinal.controller;

import com.example.healthrecordsystemfinal.entity.ContactPersonDetail;
import com.example.healthrecordsystemfinal.service.contactPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class contactPersonController {

    @Autowired
    private contactPersonService service;

    @PostMapping("/contactdetails")
    public ContactPersonDetail contactPerson(@RequestBody ContactPersonDetail contactPersonDetail) {
           return service.contactPersonDetail(contactPersonDetail);
    }
    @PostMapping("/getcontactpersondetails")
    public List<ContactPersonDetail> findAllUsers(){
        return service.getDetails();
    }
}
