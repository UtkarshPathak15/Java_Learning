package com.techmojo.app;

public class Demo_01 {

	public static void main(String[] args) {
		int a = 15;
		int b = 0;
		try {
			int c = a/b;
			System.out.println("Result : "+c);
		}
		catch (ArithmeticException ae) {
			System.out.println(ae);
		}
		System.out.println("End of the Program.");

	}

}
