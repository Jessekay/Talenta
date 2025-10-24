package com.example.Talenta.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Talenta.model.Skill;

public interface SkillRepo extends JpaRepository<Skill, UUID>{
    List<Skill> findByNameContainingIgnoreCase(String name);
    List<Skill> findByIsCoreFalse();
    List<Skill> findByCategory(String category);

    boolean existsName(String name);

    List<Skill> findByIsCoreFalseOrderByNameAsc();

    Page<Skill> findByCategory(String category, Pageable pageable);
    Page<Skill> findAll(Pageable pageable);
}
