package com.infosys.bajaj.employee_management1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.bajaj.employee_management1.dto.EmployeeDto;
import com.infosys.bajaj.employee_management1.enumeration.Department;
import com.infosys.bajaj.employee_management1.enumeration.Gender;
import com.infosys.bajaj.employee_management1.enumeration.Status;
import com.infosys.bajaj.employee_management1.model.Employee;
import com.infosys.bajaj.employee_management1.repository.EmployeeRepository;
import com.infosys.bajaj.employee_management1.utils.EmployeeConverter;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
//	@Autowired
//	private EmployeeRepository employeeRepository;
	
	private final EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository=employeeRepository;
	}

	@Override
	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
		Employee employee = EmployeeConverter.getEmployeeEntity(employeeDto);
		
		Employee savedEmployee = employeeRepository.save(employee);
		
		EmployeeDto response = EmployeeConverter.getEmployeeDto(savedEmployee);
		
		return response;
	}

	@Override
	public List<EmployeeDto> getAllEmployees() {
		List<Employee> employees = employeeRepository.findAll();
		List<EmployeeDto> employeeDtos = new ArrayList<>();
		
		for(Employee emp: employees) {
			EmployeeDto employeeDto = EmployeeConverter.getEmployeeDto(emp);
			employeeDtos.add(employeeDto);
		}
		return employeeDtos;
	}

	@Override
	public EmployeeDto getEmployeeById(long id) {
		Optional<Employee> employeeData = employeeRepository.findById(id);
		if(employeeData.isPresent()){
			Employee employee = employeeData.get();
			EmployeeDto employeeDto = EmployeeConverter.getEmployeeDto(employee);
			return employeeDto;
		}
		return null;
	}

	@Override
	public EmployeeDto updateEmployeeById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployeeById(long id) {
		employeeRepository.deleteById(id);	
	}

}
