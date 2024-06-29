package com.techmojo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techmojo.entity.Department;
import com.techmojo.entity.Employee;
import com.techmojo.exception.InvalidIdException;
import com.techmojo.repo.DepartmentRepo;
import com.techmojo.repo.EmployeeRepo;
@Service
public class DepartmentService {
	
	DepartmentRepo departmentRepo;
	EmployeeRepo employeeRepo;
	
	@Autowired
	public void setDepartment(DepartmentRepo departmentRepo) {
		this.departmentRepo = departmentRepo;
	}
	
	@Autowired
	public void setEmployeeRepo(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}

	public List<Employee> findEmployeesByDepartment(Department department) {
		return employeeRepo.findAllByDepartment(department);
	}

	public Department findDepartmentById(int id) throws InvalidIdException {
		Optional<Department> optDepartment = departmentRepo.findById(id);
		if(!optDepartment.isPresent()) {
			throw new InvalidIdException("Department Id "+id+"is not valid");
		}
		
		return optDepartment.get();
	}
	
//	public List<Department> findAllByDepartment(){
//		return departmentRepo.findAll();
//	}
	
	public Department saveDepartment(Department department) {
		return departmentRepo.save(department);
	}
	
//	public Department editDepartment(Department department) throws InvalidDepartmentIdException {
//		findDepartmentById(department.getId());
//		return departmentRepo.save(department);
//	}
	
	

}
