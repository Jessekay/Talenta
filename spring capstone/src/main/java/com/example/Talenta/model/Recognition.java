package com.example.Talenta.model;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "recognition")
public class Recognition {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToOne
    @JoinColumn(name = "employee_id", nullable = false, unique = true)
    private Employee employee;


    private String description;

    @Column(name = "date_awarded")
    private LocalDate dateAwarded;

    @Column(name = "awarded_by")
    private String awardedBy;

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
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
    public Recognition(Employee employee, String description, LocalDate dateAwarded, String awardedBy) {
        this.employee = employee;
        this.description = description;
        this.dateAwarded = dateAwarded;
        this.awardedBy = awardedBy;
    }
    
    
}
