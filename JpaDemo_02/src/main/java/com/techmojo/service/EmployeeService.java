package com.techmojo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techmojo.entity.Employee;
import com.techmojo.exception.InvalidEmployeeIdException;
import com.techmojo.exception.InvalidIdException;
import com.techmojo.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	EmployeeRepo employeeRepo;
	@Autowired
	public void setEmployeeRepo(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	public Employee deleteEmployee(int id) throws InvalidIdException{
		Employee deletedEmployee =  searchEmployee(id);
		employeeRepo.deleteById(id);
		return deletedEmployee;
	}
	
	public Employee promote(Employee employee) throws InvalidIdException {
		searchEmployee(employee.getId());
		return employeeRepo.save(employee);
	}
//	
//	public List<Employee> listofEmployees(){
//		return employeeRepo.findAll();
//	}
//	
	public Employee searchEmployee(int id) throws InvalidIdException {
		Optional<Employee> optEmployee = employeeRepo.findById(id);
		if(!optEmployee.isPresent()) {
			throw new InvalidIdException("Employee ID : "+id+" is not valid.");
		}
		
		return optEmployee.get();
		
	}
}
