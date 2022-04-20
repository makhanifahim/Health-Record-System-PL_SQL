package com.example.healthrecordsystemfinal.service;

import com.example.healthrecordsystemfinal.entity.Person;
import com.example.healthrecordsystemfinal.model.registerModel;
import com.example.healthrecordsystemfinal.repository.addressRepository;
import com.example.healthrecordsystemfinal.repository.registerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class registerService {
    @Autowired
    private registerRepository repository;

    @Autowired
    private registerModel model;

    @Autowired
    private addressRepository addressRepository;

    public Person person(Person per)
    {
        addressRepository.save(per.getAddress());
        Person p=repository.save(per);
        return p;
    }
    public List<Person> getDetails()
    {
        return repository.findAll();
    }
    public Person getPersonById(int id)
    {
        return repository.findById(id).orElse(null);
    }
    public registerModel getUserByEmail(String name)
    {
        Person person = repository.findByEmail(name);
        model.setFirst_name(person.getFirstName());
        model.setLast_name(person.getLastName());
        model.setEmail(person.getEmail());
        model.setMobileNo(person.getMobileNo());
        model.setGender(person.getGender());
        model.setBlock(person.getAddress().getBlock());
        model.setStreet(person.getAddress().getStreet());
        model.setLandmark(person.getAddress().getLandmark());
        model.setArea(person.getAddress().getArea());
        model.setPincode(person.getAddress().getPincode());
        model.setCity(person.getAddress().getCity());
        model.setState(person.getAddress().getState());
        return model;
    }
}