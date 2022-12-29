/**
 * 
 */
package com.Ust.EmployeeResitration.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ust.EmployeeResitration.Entity.Employee;
import com.Ust.EmployeeResitration.Repository.EmployeeRepository;

/**
 * @author ustjavafsdb411
 *
 */

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repository;

	public Employee createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return repository.save(emp);
	}

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public Employee getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
	Employee employee=new Employee();
		Optional<Employee> updateEmp=repository.findById(emp.getEmpId());
		
		if(updateEmp.isPresent()) {
			employee.setEmpId(updateEmp.get().getEmpId());
			employee.setDomain(emp.getDomain());
			employee.setEmpName(emp.getEmpName());
			employee.setLocation(emp.getLocation());
			employee.setEmailId(emp.getEmailId());
			employee.setExperiance(emp.getExperiance());
		}else {
			return new Employee();
		}
		
		return repository.save(employee);
	}

	public String deleteEmployee(Integer emp) {
		// TODO Auto-generated method stub
		repository.deleteById(emp);
		
		return "Employee Details Deleted";
	}

	
}
