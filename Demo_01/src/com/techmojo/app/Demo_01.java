package com.techmojo.app;

import com.techmojo.beans.Greeting;

public class Demo_01 {

	public static void main(String[] args) {
		Greeting greeting = new Greeting();
		System.out.println("Meassage : " + greeting.greet());
		greeting = null;
		System.gc();

	}
	
	

}
