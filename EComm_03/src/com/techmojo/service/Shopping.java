package com.techmojo.service;

import org.apache.log4j.Logger;

import com.techmojo.exception.InsufficientFundException;

public class Shopping {
	
	Logger logger = Logger.getLogger(Shopping.class);
	
	public double buyProduct(double balance, double prodCost) throws InsufficientFundException {
		logger.debug("Inside of buyProduct with "+balance+" and "+prodCost);
		double updatedBal;
		try {
			if(balance < prodCost) {
				logger.warn("Balance is lower than prodCost");
				InsufficientFundException ae  = new InsufficientFundException("Your account balance "+balance
																+" is not sufficient to buy the product at the cost "+prodCost);
				throw ae;
			}
			updatedBal = balance - prodCost;
			logger.debug("Balance updated to "+updatedBal);
		}
		
		finally{
			System.out.println("Complete to interact with your bank.");
		}
		logger.debug("Returning updated balance "+updatedBal);
		return updatedBal;
	}
}
	
