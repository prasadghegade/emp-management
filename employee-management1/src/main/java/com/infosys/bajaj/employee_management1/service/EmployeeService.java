package com.infosys.bajaj.employee_management1.service;

import java.util.List;

import com.infosys.bajaj.employee_management1.dto.EmployeeDto;

public interface EmployeeService {
	
	//save employee details
	EmployeeDto saveEmployee(EmployeeDto employeeDto);
	
	//list all the employee details
	List<EmployeeDto> getAllEmployees();
	
	//get the employee information
	EmployeeDto getEmployeeById(long id);
	
	//update the employee information
	EmployeeDto updateEmployeeById(long id);
	
	//soft-delete the employee information
	void deleteEmployeeById(long id);

}
