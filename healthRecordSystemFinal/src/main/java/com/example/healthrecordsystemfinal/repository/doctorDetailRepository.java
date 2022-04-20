package com.example.healthrecordsystemfinal.repository;

import com.example.healthrecordsystemfinal.entity.DoctorDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface doctorDetailRepository extends JpaRepository<DoctorDetail,Integer> {
}