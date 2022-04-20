package com.example.healthrecordsystemfinal.model;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class registerModel {
    private String first_name;
    private String last_name;
    private String email;
    private String mobileNo;
    private  String gender;
    private String block;
    private String street;
    private String landmark;
    private String area;
    private String pincode;
    private String city;
    private String state;
}