package com.example.healthrecordsystemfinal.repository;

import com.example.healthrecordsystemfinal.entity.ContactPersonDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface contactPersonRepository extends JpaRepository<ContactPersonDetail,Integer> {
}
