package com.techmojo.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExerciseDemo_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("file1.txt");
			int size = fis.available();
			byte[] array = new byte[size];
			fis.read(array);
			String cont = new String(array);
			cont = cont.toUpperCase();
			fis.close();
			
			FileOutputStream fos = new FileOutputStream("file2.txt");
			fos.write(cont.getBytes());
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
