package com.example.Talenta.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Talenta.model.Employee;


public interface EmployeeRepo extends JpaRepository<Employee,UUID>{
    
    List<Employee> findByEmail(String email);
    List<Employee> findByFirstNameContainingIgnoreCase(String name);
    List<Employee> findByLocationProvince(String provinceCode);
    
    boolean existsByEmail(String email);
    boolean existsByLocationVillage(String village);
    
    List<Employee> findAllByOrderByHireDateDesc();
    List<Employee> findByLocationProvinceOrderByLastNameAsc(String province, Sort sort);

    Page<Employee> findAll(Pageable pageable);
    Page<Employee> findByLocationProvince(String province, Pageable pageable);

    


}
