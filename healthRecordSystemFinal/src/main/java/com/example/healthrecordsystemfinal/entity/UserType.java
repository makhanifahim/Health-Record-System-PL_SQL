package com.example.healthrecordsystemfinal.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@Table(name = "user_type")
@JsonIdentityInfo(scope = UserType.class,generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class UserType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UType_id", nullable = false)
    private Integer id;

    @Column(name = "User_Type", nullable = false, length = 25)
    private String userType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

}