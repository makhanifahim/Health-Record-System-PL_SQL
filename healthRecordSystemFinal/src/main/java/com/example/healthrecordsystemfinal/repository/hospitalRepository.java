package com.example.healthrecordsystemfinal.repository;

import com.example.healthrecordsystemfinal.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface hospitalRepository extends JpaRepository<Hospital, Integer> {
}
