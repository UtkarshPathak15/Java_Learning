package com.techmojo.app;

import org.apache.log4j.Logger;

import com.techmojo.exception.InsufficientFundException;
import com.techmojo.service.Shopping;

public class Demo_01 {
	
	static Logger logger = Logger.getLogger(Demo_01.class);
		
	public static void main(String[] args) {
		Shopping shopping = new Shopping();
		double myAccountBalance = 5000.00;
		double productCost = 8500.00;
		try {
			logger.warn("Calling buyProduct with args - "+myAccountBalance+" and "+productCost);
			myAccountBalance = shopping.buyProduct(myAccountBalance, productCost);
			logger.warn("After calling buyProduct");
		} catch (InsufficientFundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			logger.error(e);
		}		
		System.out.println("After placing the order the updated balance in my account : "+myAccountBalance);

	}

}
