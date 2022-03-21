package com.jsp.MavenProject4;

import java.util.Set;

public class Employee {

		private String empId;
		private String empName;
		private Set<Long> contactNumber;
		
		public String getEmpId() {
			return empId;
		}
		public void setEmpId(String empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public Set<Long> getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(Set<Long> contactNumber) {
			this.contactNumber = contactNumber;
		}
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", contactNumber=" + contactNumber + "]";
		}
		
		
}
