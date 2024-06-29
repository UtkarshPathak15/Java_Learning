package com.techmojo.app;

import com.techmojo.service.Shopping;

public class Demo_01 {

	public static void main(String[] args) {
		Shopping shopping = new Shopping();
		double myAccountBalance = 5000.00;
		double productCost = 8500.00;
		try {
			myAccountBalance = shopping.buyProduct(myAccountBalance, productCost);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		
		System.out.println("After placing the order the updated balance in my account : "+myAccountBalance);

	}

}
