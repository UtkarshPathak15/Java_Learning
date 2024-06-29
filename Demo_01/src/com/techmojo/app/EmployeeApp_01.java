package com.techmojo.app;

import com.techmojo.beans.ContractEmployee;	
import com.techmojo.beans.RegEmployee;

public class EmployeeApp_01 {

	public static void main(String[] args) {
		
		RegEmployee regEmployee = new RegEmployee(101, "Utkarsh", "pathak15@gmail.com", 150000);
		ContractEmployee contractEmployee = new ContractEmployee(901, "Shub", "shub01@gmail.com", 1000);
		
		System.out.println("Regular Employee : "+regEmployee);
		System.out.println("Contract Employee : "+contractEmployee);
		
		

	}

}
