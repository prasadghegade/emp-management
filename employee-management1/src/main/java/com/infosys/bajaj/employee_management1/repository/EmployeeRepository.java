package com.infosys.bajaj.employee_management1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.bajaj.employee_management1.model.Employee;

@Repository  // optional
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
