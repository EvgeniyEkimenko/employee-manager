package com.ekimenko.spring.employeemanager.service.impl;

import com.ekimenko.spring.employeemanager.exception.UserNotFoundException;
import com.ekimenko.spring.employeemanager.model.Employee;
import com.ekimenko.spring.employeemanager.repository.EmployeeRepos;
import com.ekimenko.spring.employeemanager.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//UUID
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepos employeeRepos;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepos employeeRepos) {
        this.employeeRepos = employeeRepos;
    }


    @Override
    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepos.save(employee);
    }

    @Override
    public List<Employee> findAllEmployee() {

        return employeeRepos.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepos.save(employee);
    }

    @Override
    public Employee findEmployeeById(Long id) {
        return employeeRepos.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " not found"));
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepos.deleteById(id);
    }
}
