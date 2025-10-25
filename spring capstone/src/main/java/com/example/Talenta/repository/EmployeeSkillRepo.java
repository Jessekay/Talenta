package com.example.Talenta.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Talenta.model.EmployeeSkill;

public interface EmployeeSkillRepo extends JpaRepository<EmployeeSkill, UUID>{
    List<EmployeeSkill> findByEmployeeId(UUID employeeId);
    List<EmployeeSkill> findBySkillName(String skillName);
    List<EmployeeSkill> findByProficiencyLevel(String level);

    boolean existsByEmployeeIdAndSkillId(UUID employeeId, UUID skillId);

    List<EmployeeSkill> findByEmployeeIdOrderByAcquisitionDateDesc(UUID employeeId);

    Page<EmployeeSkill> findByEmployeeId(UUID employeeId, Pageable pageable);

    @Query("SELECT es FROM EmployeeSkill es WHERE es.skill.isCore = false AND es.skill.name = :skillName")
    List<EmployeeSkill> findHiddenTalentHolders(@Param("skillName") String skillName);
    
}
