package com.ekimenko.spring.employeemanager.repository;

import com.ekimenko.spring.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepos extends JpaRepository<Employee , Long> {
    
}
