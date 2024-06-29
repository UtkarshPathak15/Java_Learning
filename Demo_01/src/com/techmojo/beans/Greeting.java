package com.techmojo.beans;

public class Greeting {
	public String greet() {
		String message = "Hello folks!!!";
		return message;
		
	}
	
	public void finalize() {
		System.out.println("Called finalize");
	}
}
