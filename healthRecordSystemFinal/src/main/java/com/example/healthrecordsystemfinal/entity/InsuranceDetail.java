package com.example.healthrecordsystemfinal.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@Table(name = "insurance_detail")
@JsonIdentityInfo(scope = InsuranceDetail.class,generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class InsuranceDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Insurance_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "Person_id", nullable = false)
    private Person person;

    @Column(name = "Insurance_No", nullable = false)
    private Integer insuranceNo;

    @Column(name = "Insurance_Coverage", nullable = false)
    private Integer insuranceCoverage;

    @Column(name = "Insurance_Type", nullable = false)
    private Integer insuranceType;

    @Column(name = "Insurance_Expiry", nullable = false)
    private Integer insuranceExpiry;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Integer getInsuranceNo() {
        return insuranceNo;
    }

    public void setInsuranceNo(Integer insuranceNo) {
        this.insuranceNo = insuranceNo;
    }

    public Integer getInsuranceCoverage() {
        return insuranceCoverage;
    }

    public void setInsuranceCoverage(Integer insuranceCoverage) {
        this.insuranceCoverage = insuranceCoverage;
    }

    public Integer getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(Integer insuranceType) {
        this.insuranceType = insuranceType;
    }

    public Integer getInsuranceExpiry() {
        return insuranceExpiry;
    }

    public void setInsuranceExpiry(Integer insuranceExpiry) {
        this.insuranceExpiry = insuranceExpiry;
    }

}