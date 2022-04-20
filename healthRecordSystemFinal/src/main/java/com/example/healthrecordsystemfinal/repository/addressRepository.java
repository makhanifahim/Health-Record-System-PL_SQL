package com.example.healthrecordsystemfinal.repository;

import com.example.healthrecordsystemfinal.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface addressRepository extends JpaRepository<Address, Integer> {
}
