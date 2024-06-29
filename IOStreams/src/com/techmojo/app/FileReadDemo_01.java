package com.techmojo.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadDemo_01 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("file1.txt");
			int noBytes = fis.available();
			byte[] array = new byte[noBytes];
			fis.read(array);
			String content = new String(array);
			System.out.println("File content : ");
			System.out.println(content);
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
