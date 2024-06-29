package com.techmojo.beans;

public class ContractEmployee extends Employee {
	double payPerHr;

	public ContractEmployee() {
		super();
	}

	public ContractEmployee(int id, String name, String email, double payPerHr) {
		super(id, name, email);
		this.payPerHr = payPerHr;
	}

	public double getPayPerHr() {
		return payPerHr;
	}

	public void setPayPerHr(double payPerHr) {
		this.payPerHr = payPerHr;
	}

	@Override
	public String toString() {
		return "ContractEmployee ["+super.toString()+" payPerHr=" + payPerHr + "]";
	}
	
	
	
	
	

}
