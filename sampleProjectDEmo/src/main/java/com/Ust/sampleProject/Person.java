/**
 * 
 */
package com.Ust.sampleProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ustjavafsdb411
 *
 */
@Component(value = "person")
public class Person {

	
	String personId;
	
	
	String name;
	
	
	String location;


	@Autowired
	public Person(@Value("123") String personId, @Value("Jeevan") String name, @Value("NRT") String location) {
		super();
		this.personId = personId;
		this.name = name;
		this.location = location;
	}


	public String getPersonId() {
		return personId;
	}


	public void setPersonId(String personId) {
		this.personId = personId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", location=" + location + "]";
	}
	
	
	
	
}
