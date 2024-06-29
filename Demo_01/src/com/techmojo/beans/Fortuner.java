package com.techmojo.beans;

public class Fortuner implements Car {

	@Override
	public void turnDirection() {
		System.out.println("Turn Direction of Fortuner");

	}

	@Override
	public void accelerate() {
		System.out.println("Accelerate the Fortuner");

	}

	@Override
	public void stop() {
		System.out.println("Stop the Fortuner");

	}
	
	public void fourWheel() {
		System.out.println("Four wheel drive");
		
	}

}
