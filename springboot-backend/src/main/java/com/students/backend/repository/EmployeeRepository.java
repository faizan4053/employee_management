package com.students.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.students.backend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
