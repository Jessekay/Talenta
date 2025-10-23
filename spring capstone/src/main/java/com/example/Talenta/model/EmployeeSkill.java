package com.example.Talenta.model;

import java.time.LocalDate;
import java.util.UUID;

public class EmployeeSkill {
    private UUID id;
    private String employee;
    private String skill;
    private String proficiencyLevel;
    private LocalDate acquisitionDate;
    private String progressNotes;
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
    public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }
    public String getProficiencyLevel() {
        return proficiencyLevel;
    }
    public void setProficiencyLevel(String proficiencyLevel) {
        this.proficiencyLevel = proficiencyLevel;
    }
    public LocalDate getAcquisitionDate() {
        return acquisitionDate;
    }
    public void setAcquisitionDate(LocalDate acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }
    public String getProgressNotes() {
        return progressNotes;
    }
    public void setProgressNotes(String progressNotes) {
        this.progressNotes = progressNotes;
    }
    public EmployeeSkill() {
    }
    public EmployeeSkill(UUID id, String employee, String skill, String proficiencyLevel, LocalDate acquisitionDate,
            String progressNotes) {
        this.id = id;
        this.employee = employee;
        this.skill = skill;
        this.proficiencyLevel = proficiencyLevel;
        this.acquisitionDate = acquisitionDate;
        this.progressNotes = progressNotes;
    }

    
}
