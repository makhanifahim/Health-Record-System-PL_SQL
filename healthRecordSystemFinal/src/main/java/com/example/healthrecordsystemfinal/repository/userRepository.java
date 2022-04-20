package com.example.healthrecordsystemfinal.repository;

import com.example.healthrecordsystemfinal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface userRepository extends JpaRepository<User, Integer> {
    @Query(value = "Select * from User where username = ?1 and password=?2",nativeQuery = true)
    String userLogin(String username,String password);
    Optional<User> findByUsername(String Username);
}
