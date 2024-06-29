package com.techmojo.app;

public class Demo_02 {

	public static void main(String[] args) {
		int[] ar = new int[5];
		for (int c=0;c<5;c++){
			ar[c] = c*3+2;
		}
		System.out.println("Array elements :");
		
		for(int c=0;c<5;c++) {
			System.out.println(ar[c]);
		}
		
		try {
			System.out.println("Result : "+ar[5]);
		}
//		catch (ArrayIndexOutOfBoundsException ae) {
//			ae.printStackTrace();
//		}
		finally {
			System.out.println("End of the Program");
		}
	}

}
