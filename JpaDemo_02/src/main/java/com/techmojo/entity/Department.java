package com.techmojo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department1")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String location;
	@OneToMany(mappedBy = "department" , cascade = CascadeType.ALL)
	List<Employee> employees;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int id, String name, String location, List<Employee> employees) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.employees = employees;
	}
	public Department(String name, String location, List<Employee> employees) {
		super();
		this.name = name;
		this.location = location;
		this.employees = employees;
	}
	
	
	public Department(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
	
	
	
	
	
	
	

}
