package com.techmojo.app;

import java.util.Properties;

public class PropsDemo_01 {

	public static void main(String[] args) {
		
		Properties props = new Properties();
		props.setProperty("name", "Utkarsh");
		props.setProperty("email", "pathak15@gmail.com");
		props.setProperty("tech", "Java");
		
		System.out.println(props.getProperty("email"));
		System.out.println(props);

	}

}
