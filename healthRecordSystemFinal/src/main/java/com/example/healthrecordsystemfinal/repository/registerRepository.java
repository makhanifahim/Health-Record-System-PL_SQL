package com.example.healthrecordsystemfinal.repository;

import com.example.healthrecordsystemfinal.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
public interface registerRepository extends JpaRepository<Person,Integer> {
    Person findByEmail(String name);
}
