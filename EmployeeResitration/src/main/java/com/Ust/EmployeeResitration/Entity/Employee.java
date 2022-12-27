/**
 * 
 */
package com.Ust.EmployeeResitration.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author ustjavafsdb411
 *
 */
@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue
	private int empId;
	
	private String empName;
	
	private String location;
	
	private String domain;
	
	private String emailId;
	
	private int experiance;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getExperiance() {
		return experiance;
	}

	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}

	public Employee(int empId, String empName, String location, String domain, String emailId, int experiance) {
		
		this.empId = empId;
		this.empName = empName;
		this.location = location;
		this.domain = domain;
		this.emailId = emailId;
		this.experiance = experiance;
	}

	public Employee() {
		
	}
	
	
}
