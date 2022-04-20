package com.example.healthrecordsystemfinal.repository;

import com.example.healthrecordsystemfinal.entity.HospitalDoctor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface hospitalDoctorRepository extends JpaRepository<HospitalDoctor, Integer> {
}
