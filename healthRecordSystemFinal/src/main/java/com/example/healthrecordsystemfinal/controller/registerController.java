package com.example.healthrecordsystemfinal.controller;

import com.example.healthrecordsystemfinal.entity.Person;
import com.example.healthrecordsystemfinal.model.registerModel;
import com.example.healthrecordsystemfinal.repository.registerRepository;
import com.example.healthrecordsystemfinal.service.registerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class registerController {

    @Autowired
    public registerRepository repository;

    @Autowired
    private registerService service;

    @PostMapping("/register")
    public int registerUser(@RequestBody Person person) {
        Person currReg = service.person(person);
        return currReg.getId();
    }
    @PostMapping("/getdetails")
    public List<Person> findAllUsers(){
        return service.getDetails();
    }

    @PostMapping("/personById/{id}")
    public Person findPersonById(@PathVariable int id)
    {
        return service.getPersonById(id);
    }

    @PostMapping("/registeruser/{name}")
    public registerModel findPersonByName(@PathVariable String name){
        return service.getUserByEmail(name);
    }
}