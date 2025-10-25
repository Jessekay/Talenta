package com.example.Talenta.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Talenta.model.EmployeeSkill;

public interface EmployeeSkillRepo extends JpaRepository<EmployeeSkill, UUID>{
    List<EmployeeSkill> findByEmployeeId(UUID employeeId);
    List<EmployeeSkill> findBySkillName(String skillName);
    List<EmployeeSkill> findByProficiencyLevel(String level);
}
