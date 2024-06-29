package com.techmojo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techmojo.entity.Department;
import com.techmojo.entity.Employee;
import com.techmojo.exception.InvalidIdException;
import com.techmojo.service.DepartmentService;
import com.techmojo.service.EmployeeService;

public class App {
  public static void main(String[] args) {
	
	ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
	EmployeeService employeeService =  ctxt.getBean(EmployeeService.class);
	Department d1 = new Department("HR", "Hyderabad");
	Department d2 = new Department("Technical", "Bangalore");
	DepartmentService departmentService = ctxt.getBean(DepartmentService.class);
//	System.out.println(departmentService);
//	DepartmentService departmentService1 = new DepartmentService();
//	
	try {
		Department d3 = departmentService.findDepartmentById(1);
//		System.out.println(d3);
		List<Employee> employees = departmentService.findEmployeesByDepartment(d3);
		for(Employee employee:employees) {
			System.out.println(employee);
		}
	} catch (InvalidIdException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

//	
//	Department d1 = new Department("HR", "Hyderabad");
//	Department d2 = new Department("Technical", "Bangalore");
//	
//	Employee employee1 = new Employee("Employee_101", "101@gmail.com", d1);
//	Employee employee2 = new Employee("Employee_102", "102@gmail.com", d2);
//	Employee employee3 = new Employee("Employee_103", "103@gmail.com", d2);
//	Employee employee4 = new Employee("Employee_104", "104@gmail.com", d1);
//	Employee employee5 = new Employee("Employee_105", "105@gmail.com", d1);
	
//	List<Employee> list1 = new ArrayList<Employee>();
//	list1.add(employee1);
//	list1.add(employee4);
//	list1.add(employee5);
//	
//	List<Employee> list2 = new ArrayList<Employee>();
//	list2.add(employee2);
//	list2.add(employee3);
//	
//	
//	d1.setEmployees(list1);
//	d2.setEmployees(list2);
	
//	departmentService.saveDepartment(d1);
//	departmentService.saveDepartment(d2);
//	
//	employeeService.saveEmployee(employee1);
//	employeeService.saveEmployee(employee2);
//	employeeService.saveEmployee(employee3);
//	employeeService.saveEmployee(employee4);
//	employeeService.saveEmployee(employee5);
	
	
	
	
	
	
	
    System.out.println("Completed..");
  }
}
