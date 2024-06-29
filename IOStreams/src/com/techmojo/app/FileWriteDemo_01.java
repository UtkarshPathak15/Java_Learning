package com.techmojo.app;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteDemo_01 {

	public static void main(String[] args) {
		String name = "Java Programming";
		System.out.println("Welcome to File - IO");
		try {
			FileOutputStream fos = new FileOutputStream("file1.txt",true);
			fos.write(name.getBytes());
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Completed.");

	}

}
