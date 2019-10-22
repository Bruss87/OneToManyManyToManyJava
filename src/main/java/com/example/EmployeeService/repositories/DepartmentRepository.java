package com.example.EmployeeService.repositories;

import com.example.EmployeeService.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

    public interface DepartmentRepository extends JpaRepository <Department, Long> {
}
