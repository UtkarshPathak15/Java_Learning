package com.techmojo.beans;

public class Employee implements Comparable<Employee>{
	int id;
	String name;
	String email;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	@Override
	public int compareTo(Employee other) {
		/*
		 * if this > other = +ve
		 * if this ==other = 0
		 * if this < 0 = -ve
		 */
		return this.id - other.id;
	}
	
	
}
