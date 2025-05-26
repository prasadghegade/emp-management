package com.infosys.bajaj.employee_management1.utils;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.infosys.bajaj.employee_management1.dto.EmployeeDto;
import com.infosys.bajaj.employee_management1.dto.ParsedName;
import com.infosys.bajaj.employee_management1.enumeration.Department;
import com.infosys.bajaj.employee_management1.enumeration.Gender;
import com.infosys.bajaj.employee_management1.enumeration.Status;
import com.infosys.bajaj.employee_management1.model.Employee;

public class EmployeeConverter {

	public static EmployeeDto getEmployeeDto(Employee savedEmployee) {
		EmployeeDto response = new EmployeeDto();
		response.setDepartment(savedEmployee.getDepartment().name());
		response.setDOB(savedEmployee.getDOB());
		response.setEmail(savedEmployee.getEmail());
		response.setFaculty(savedEmployee.getFaculty());
		response.setGender(savedEmployee.getGender().name());
		response.setJoinDate(savedEmployee.getJoinDate());
		String firstName = savedEmployee.getFirstName();
		String middleName = savedEmployee.getMiddleName();
		String lastName = savedEmployee.getLastName();
		String fullName=firstName.concat(middleName).concat(lastName);
		response.setName(fullName);
		response.setPhoneNumber(savedEmployee.getPhoneNumber());
		response.setUserName(savedEmployee.getUserName());
		return response;
	}
	
	public static Employee getEmployeeEntity(EmployeeDto employeeDto) {
		Employee employee = new Employee();
		ParsedName names = extractNames(employeeDto);
		employee.setFirstName(names.getFirstName());
		employee.setMiddleName(names.getMiddleName());
		employee.setLastName(names.getLastName());
		employee.setDOB(employeeDto.getDOB());
		employee.setEmail(employeeDto.getEmail());
		employee.setDepartment(Department.fromValue(employeeDto.getDepartment()));
		employee.setFaculty(employeeDto.getFaculty());
		employee.setGender(Gender.valueOf(employeeDto.getGender()));
		employee.setJoinDate(employeeDto.getJoinDate());
		employee.setUserName(employeeDto.getUserName());
		employee.setPhoneNumber(employeeDto.getPhoneNumber());
		employee.setIsActive(Status.ACTIVE);
		return employee;
	}
	
	private static String getFullName(Employee savedEmp) {
		String firstName = savedEmp.getFirstName();
		String middleName = savedEmp.getMiddleName();
		String lastName = savedEmp.getLastName();
		String fullName = Stream.of(firstName, middleName, lastName).filter(part -> part != null && !part.isEmpty())
				.collect(Collectors.joining(" "));
		return fullName;
	}

	
	public static ParsedName extractNames(EmployeeDto employeeDto) {
		if (employeeDto.getName() == null || employeeDto.getName().trim().isEmpty()) {
			return new ParsedName("", "", "");
		}

		String[] nameParts = employeeDto.getName().trim().split("\\s+");
		String firstName = "";
		String middleName = "";
		String lastName = "";

		if (nameParts.length == 1) {
			firstName = nameParts[0];
		} else if (nameParts.length == 2) {
			firstName = nameParts[0];
			lastName = nameParts[1];
		} else if (nameParts.length >= 3) {
			firstName = nameParts[0];
			lastName = nameParts[nameParts.length - 1];
			middleName = String.join(" ", Arrays.copyOfRange(nameParts, 1, nameParts.length - 1));
		}

		return new ParsedName(firstName, middleName, lastName);
	}
}
