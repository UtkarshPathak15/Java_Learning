package com.techmojo.app;

import java.util.TreeSet;

import com.techmojo.beans.Employee;

public class EmpployeeSetApp_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Employee> employees = new TreeSet<Employee>();
		employees.add(new Employee(102, "Utkarsh", "utkarsh15@gmail.com"));
		employees.add(new Employee(101, "Pathak", "pathak159@gmail.com"));
		employees.add(new Employee(103, "Lokesh", "lokesh17@gmail.com"));
		employees.add(new Employee(104, "Abhijeet", "abhijeet15@gmail.com"));
		employees.add(new Employee(105, "Sharma", "sharma15@gmail.com"));
		
		employees.add(new Employee(105, "Abhijeet", "abhijeet15@gmail.com"));
		employees.add(new Employee(104, "Sharma", "sharma15@gmail.com"));
		
		System.out.println("No. of employees in the Set : "+employees.size());
		
		System.out.println("Employees existing :");
		for(Employee employee :employees) {
			System.out.println(employee);
		}
		
		System.out.println("End of the Program");
	}

}
