package com.techmojo.beans;

public class Salavia implements Car {

	@Override
	public void turnDirection() {
		System.out.println("Turn Direction of Salavia");

	}

	@Override
	public void accelerate() {
		System.out.println("Accelerate the Salavia");

	}

	@Override
	public void stop() {
		System.out.println("Stop the Salavia");

	}

	public void sunRoof() {
		System.out.println("Open the SunRoof of Salavia");
	}
	
}
