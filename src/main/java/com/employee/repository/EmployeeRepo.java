package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.entityes.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
