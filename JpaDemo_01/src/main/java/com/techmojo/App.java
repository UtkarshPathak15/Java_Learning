package com.techmojo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techmojo.entity.Employee;
import com.techmojo.exception.InvalidEmployeeIdException;
import com.techmojo.service.EmployeeService;

public class App {
  public static void main(String[] args) {
	
	ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
	EmployeeService employeeService =  ctxt.getBean(EmployeeService.class);
//	Employee employee1 = new Employee("Employee_101", "101@gmail.com", "MTS");
//	Employee employee2 = new Employee("Employee_102", "102@gmail.com", "Developer");
//	Employee employee3 = new Employee("Employee_103", "103@gmail.com", "Developer");
//	Employee employee4 = new Employee("Employee_104", "104@gmail.com", "MTS");
//	Employee employee5 = new Employee("Employee_105", "105@gmail.com", "Designer");
//    System.out.println("Employee before saving : "+employee1);
//    Employee saveEmployee = employeeService.recruit(employee1);
//    System.out.println("Saved Employee : "+saveEmployee);
//    employeeService.recruit(employee2);
//    employeeService.recruit(employee3);
//    employeeService.recruit(employee4);
//    employeeService.recruit(employee5);
	
	try {
		Employee e1 = employeeService.searchEmployee(4);
		System.out.println("e1 : "+e1);
		e1.setDesignation("Sr. Developer");
		employeeService.promote(e1);
		
		List<Employee> employees = employeeService.listofEmployees();
		for(Employee employee : employees) {
			System.out.println(employee);
		}
		
		Employee e2 = employeeService.searchEmployee(101);
		System.out.println("e2 : "+e2);
		
		
		
	} catch (InvalidEmployeeIdException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("End of the application");
	
  }
}
