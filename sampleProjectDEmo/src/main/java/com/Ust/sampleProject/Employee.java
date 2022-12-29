package com.Ust.sampleProject;

public class Employee {

	private String eid;
	private String name;
	private String location;
	
//	public void setEid(String eid) {
//		this.eid = eid;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setLocation(String location) {
//		this.location = location;
//	}
	
	
	
	public void display() {
		System.out.println("Employee Display Method "+" EmpID = "+eid+" EmpName = "+name+" EmpLocation = "+location );
	}

public Employee(String eid, String name, String location) {
	super();
	this.eid = eid;
	this.name = name;
	this.location = location;
}
}
