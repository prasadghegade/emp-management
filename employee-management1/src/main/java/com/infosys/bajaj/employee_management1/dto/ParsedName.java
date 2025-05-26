package com.infosys.bajaj.employee_management1.dto;

public class ParsedName {
		private String firstName;
		private String middleName;
		private String lastName;

		public ParsedName(String firstName, String middleName, String lastName) {
			this.firstName = firstName;
			this.middleName = middleName;
			this.lastName = lastName;
		}

		public String getFirstName() {
			return firstName;
		}

		public String getMiddleName() {
			return middleName;
		}

		public String getLastName() {
			return lastName;
		}

		@Override
		public String toString() {
			return "ParsedName{" + "firstName='" + firstName + '\'' + ", middleName='" + middleName + '\'' + ", lastName='"
					+ lastName + '\'' + '}';
		}

}
