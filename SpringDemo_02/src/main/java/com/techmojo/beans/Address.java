package com.techmojo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("Hitech City")
	String street;
	@Value("Hyderabad")
	String city;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
	
}
