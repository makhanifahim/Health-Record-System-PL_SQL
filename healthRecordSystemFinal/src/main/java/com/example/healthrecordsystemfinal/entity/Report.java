package com.example.healthrecordsystemfinal.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@Table(name = "report")
@JsonIdentityInfo(scope = Report.class,generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Report_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "User_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "Doctor_id", nullable = false)
    private DoctorDetail doctor;

    @Column(name = "Report_Priority", nullable = false)
    private Integer reportPriority;

    @Column(name = "Report_Subject", nullable = false, length = 40)
    private String reportSubject;

    @Column(name = "Report_Type", nullable = false, length = 30)
    private String reportType;

    @Column(name = "Report_Description", nullable = false, length = 200)
    private String reportDescription;

    @Column(name = "Report_Document", nullable = false, length = 200)
    private String reportDocument;

    @Column(name = "report_date_and_time", nullable = false, length = 40)
    private String reportDateAndTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public DoctorDetail getDoctor() {
        return doctor;
    }

    public void setDoctor(DoctorDetail doctor) {
        this.doctor = doctor;
    }

    public Integer getReportPriority() {
        return reportPriority;
    }

    public void setReportPriority(Integer reportPriority) {
        this.reportPriority = reportPriority;
    }

    public String getReportSubject() {
        return reportSubject;
    }

    public void setReportSubject(String reportSubject) {
        this.reportSubject = reportSubject;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReportDescription() {
        return reportDescription;
    }

    public void setReportDescription(String reportDescription) {
        this.reportDescription = reportDescription;
    }

    public String getReportDocument() {
        return reportDocument;
    }

    public void setReportDocument(String reportDocument) {
        this.reportDocument = reportDocument;
    }

    public String getReportDateAndTime() {
        return reportDateAndTime;
    }

    public void setReportDateAndTime(String reportDateAndTime) {
        this.reportDateAndTime = reportDateAndTime;
    }

}