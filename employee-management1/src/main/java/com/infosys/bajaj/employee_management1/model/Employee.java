package com.infosys.bajaj.employee_management1.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.infosys.bajaj.employee_management1.enumeration.Department;
import com.infosys.bajaj.employee_management1.enumeration.Gender;
import com.infosys.bajaj.employee_management1.enumeration.Status;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private Long empId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "middle_name")
	private String middleName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "dob")
	private LocalDate DOB;
	@Column(name = "gender")
	private Gender gender;
	@Column(name = "faulty")
	private String faculty;
	@Column(name = "department")
	private Department department;
	@Column(name = "join_date")
	private LocalDate joinDate;
	@Column(name = "email")
	private String email;
	@Column(name = "phone_number")
	private String phoneNumber;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "is_active")
	private Status isActive;

	public Employee() {

	}

	public Employee(Long empId, String firstName, String middleName, String lastName, LocalDate dOB, Gender gender,
			String faculty, Department department, LocalDate joinDate, String email, String phoneNumber,
			String userName, Status isActive) {
		this.empId = empId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.DOB = dOB;
		this.gender = gender;
		this.faculty = faculty;
		this.department = department;
		this.joinDate = joinDate;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.userName = userName;
		this.isActive = isActive;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		this.DOB = dOB;
	}

	public Status getIsActive() {
		return isActive;
	}

	public void setIsActive(Status isActive) {
		this.isActive = isActive;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", DOB=" + DOB + ", gender=" + gender + ", faculty=" + faculty + ", department="
				+ department + ", joinDate=" + joinDate + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", userName=" + userName + ", isActive=" + isActive + "]";
	}

}
