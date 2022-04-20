package com.example.healthrecordsystemfinal.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@JsonIdentityInfo(scope = Address.class,generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Address_id", nullable = false)
    private Integer id;

    @Column(name = "Block", nullable = false, length = 20)
    private String block;

    @Column(name = "Street", nullable = false, length = 30)
    private String street;

    @Column(name = "Landmark", nullable = false, length = 30)
    private String landmark;

    @Column(name = "Area", nullable = false, length = 20)
    private String area;

    @Column(name = "Pincode", nullable = false, length = 6)
    private String pincode;

    @Column(name = "City", nullable = false, length = 25)
    private String city;

    @Column(name = "State", nullable = false, length = 25)
    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}