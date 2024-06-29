package com.techmojo.beans;

public class RegEmployee extends Employee{
	double basicPay;

	public RegEmployee() {
		super();
	}

	public RegEmployee(int id, String name, String email, double basicPay) {
		super(id, name, email);
		this.basicPay = basicPay;
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	@Override
	public String toString() {
		return "RegEmployee ["+super.toString()+" basicPay=" + basicPay + "]";
	}	
	
	

}
