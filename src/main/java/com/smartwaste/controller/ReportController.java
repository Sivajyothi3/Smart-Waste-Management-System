package com.smartwaste.controller;

import com.smartwaste.model.Report;
import com.smartwaste.repository.ReportRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/reports")
@CrossOrigin(origins = "*")
public class ReportController {

    private final ReportRepository reportRepository;

    public ReportController(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    @GetMapping
    public List<Report> getAllReports() {
        return reportRepository.findAll();
    }

    @PostMapping
    public Report addReport(@RequestBody Report report) {
        return reportRepository.save(report);
    }

    @PutMapping("/{id}")
    public Report updateReport(@PathVariable Long id, @RequestBody Report updatedReport) {
        return reportRepository.findById(id).map(report -> {
            report.setStatus(updatedReport.getStatus());
            report.setDescription(updatedReport.getDescription());
            report.setIssue(updatedReport.getIssue());
            return reportRepository.save(report);
        }).orElseThrow(() -> new RuntimeException("Report not found with id: " + id));
    }

    @DeleteMapping("/{id}")
    public void deleteReport(@PathVariable Long id) {
        reportRepository.deleteById(id);
    }
}