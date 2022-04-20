package com.example.healthrecordsystemfinal.service;

import com.example.healthrecordsystemfinal.entity.Report;
import com.example.healthrecordsystemfinal.repository.reportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class reportService {
    @Autowired
    private reportRepository reportReposit;

    public Report report(Report report)
    {
        return reportReposit.save(report);
    }
    public List<Report> getDetails()
    {
        return reportReposit.findAll();
    }
    public Report updateReport(Report report)
    {
        Report existingReport=reportReposit.findById(report.getId()).orElse(null);
        existingReport.setReportDescription(report.getReportDescription());
        existingReport.setReportDocument(report.getReportDocument());
        existingReport.setReportSubject(report.getReportSubject());
        existingReport.setReportType(report.getReportType());
        return reportReposit.save(existingReport);
    }
    public List<Report> getReportsByUserId(int id)
    {
        return reportReposit.findReportsByUserId(id);
    }
    public String deleteReport(int id)
    {
        reportReposit.deleteById(id);
        return "report removed"+id;
    }
}
