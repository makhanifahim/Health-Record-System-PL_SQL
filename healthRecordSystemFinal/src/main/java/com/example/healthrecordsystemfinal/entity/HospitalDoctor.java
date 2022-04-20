package com.example.healthrecordsystemfinal.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@Table(name = "hospital_doctor")
@JsonIdentityInfo(scope = HospitalDoctor.class,generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class HospitalDoctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Hdid", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "Hospital_id", nullable = false)
    private Hospital hospital;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "Doctor_id", nullable = false)
    private DoctorDetail doctor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public DoctorDetail getDoctor() {
        return doctor;
    }

    public void setDoctor(DoctorDetail doctor) {
        this.doctor = doctor;
    }

}