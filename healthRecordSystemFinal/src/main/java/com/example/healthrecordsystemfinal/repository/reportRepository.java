package com.example.healthrecordsystemfinal.repository;

import com.example.healthrecordsystemfinal.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface reportRepository extends JpaRepository<Report, Integer> {
    List<Report> findReportsByUserId(int id);
}