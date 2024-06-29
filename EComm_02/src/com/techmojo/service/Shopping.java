package com.techmojo.service;

public class Shopping {
	public double buyProduct(double balance, double prodCost) throws Exception {
		double updatedBal;
		try {
			if(balance < prodCost) {
				Exception ae  = new Exception("Your account balance "+balance
																+" is not sufficient to buy the product at the cost "+prodCost);
				throw ae;
			}
			updatedBal = balance - prodCost;
		}
		
		finally{
			System.out.println("Complete to interact with your bank.");
		}
		
		return updatedBal;
	}
}
	
