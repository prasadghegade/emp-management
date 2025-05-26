package com.infosys.bajaj.employee_management1.enumeration;

public enum Department {
	
	COMPUTER_SCIENCE("Computer Science"), BIOLOGY("Biology"), CHEMISYRY("Chemistry"), PHYSICS("Physics"),
	MATHS("Maths");

	private String value;

	Department(String value) {
		this.value = value;
	}
	
	public static Department fromValue(String value) {
        for (Department department : Department.values()) {
            if (department.value.equalsIgnoreCase(value)) {
                return department;
            }
        }
        throw new IllegalArgumentException("Unknown department: " + value);
    }

}
