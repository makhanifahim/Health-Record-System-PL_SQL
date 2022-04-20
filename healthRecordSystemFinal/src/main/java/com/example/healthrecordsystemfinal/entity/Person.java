package com.example.healthrecordsystemfinal.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@Table(name = "person")
@JsonIdentityInfo(scope = Person.class,generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Person_id", nullable = false)
    private Integer id;

    @Column(name = "First_Name", nullable = false, length = 20)
    private String firstName;

    @Column(name = "Last_Name", nullable = false, length = 20)
    private String lastName;

    @Column(name = "Email", nullable = false, length = 50)
    private String email;

    @Column(name = "Mobile_No", nullable = false, length = 12)
    private String mobileNo;

    @Column(name = "Gender", nullable = false, length = 10)
    private String gender;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "Address_id", nullable = false)
    private Address address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}