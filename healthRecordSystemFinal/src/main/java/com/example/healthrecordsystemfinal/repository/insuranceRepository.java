package com.example.healthrecordsystemfinal.repository;

import com.example.healthrecordsystemfinal.entity.InsuranceDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface insuranceRepository extends JpaRepository<InsuranceDetail,Integer> {
}
