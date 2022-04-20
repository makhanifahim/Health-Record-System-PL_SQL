package com.example.healthrecordsystemfinal.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@Table(name = "hospital")
@JsonIdentityInfo(scope = Hospital.class,generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Hospital_id", nullable = false)
    private Integer id;

    @Column(name = "Hospital_Name", nullable = false, length = 50)
    private String hospitalName;

    @Column(name = "Hospital_Type", nullable = false, length = 30)
    private String hospitalType;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "Address_id", nullable = false)
    private Address address;

    @Column(name = "Hospital_No", nullable = false)
    private Integer hospitalNo;

    @Column(name = "Hospital_Email", nullable = false, length = 50)
    private String hospitalEmail;

    @Column(name = "Description", nullable = false, length = 200)
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalType() {
        return hospitalType;
    }

    public void setHospitalType(String hospitalType) {
        this.hospitalType = hospitalType;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getHospitalNo() {
        return hospitalNo;
    }

    public void setHospitalNo(Integer hospitalNo) {
        this.hospitalNo = hospitalNo;
    }

    public String getHospitalEmail() {
        return hospitalEmail;
    }

    public void setHospitalEmail(String hospitalEmail) {
        this.hospitalEmail = hospitalEmail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}