/**
 * 
 */
package com.Ust.EmployeeResitration.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ust.EmployeeResitration.Entity.Employee;
import com.Ust.EmployeeResitration.Repository.EmployeeRepository;
import com.Ust.EmployeeResitration.Service.EmployeeService;

/**
 * @author ustjavafsdb411
 *
 */

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@PostMapping("/save")
	public Employee saveDetails(@RequestBody Employee emp){
		return service.createEmployee(emp);
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}
	
	@GetMapping("/getbyId/{id}")
	public Employee getEmployee(@PathVariable Integer id) {
		return service.getEmployeeById(id);		
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return service.updateEmployee(emp);
		
	}
	@DeleteMapping("/delete")
	public String deleteEmployee(@RequestBody Integer emp) {
		return service.deleteEmployee(emp);
		
	}
	
}
