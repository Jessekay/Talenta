package com.example.Talenta.model;

import java.time.LocalDate;
import java.util.UUID;

public class Recognition {
    private UUID id;
    private String employee;
    private String description;
    private LocalDate dateAwarded;
    private String awardedBy;
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getEmployee() {
        return employee;
    }
    public void setEmployee(String employee) {
        this.employee = employee;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDate getDateAwarded() {
        return dateAwarded;
    }
    public void setDateAwarded(LocalDate dateAwarded) {
        this.dateAwarded = dateAwarded;
    }
    public String getAwardedBy() {
        return awardedBy;
    }
    public void setAwardedBy(String awardedBy) {
        this.awardedBy = awardedBy;
    }
    public Recognition() {
    }
    public Recognition(UUID id, String employee, String description, LocalDate dateAwarded, String awardedBy) {
        this.id = id;
        this.employee = employee;
        this.description = description;
        this.dateAwarded = dateAwarded;
        this.awardedBy = awardedBy;
    }
    
    
}
