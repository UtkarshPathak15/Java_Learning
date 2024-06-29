package com.techmojo.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.techmojo.beans.Student;

public class StudentOperation_01 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("student.txt");
			int noBytes = fis.available();
			byte[] array = new byte[noBytes];
			fis.read(array);
			String content = new String(array);
			String[] lines = content.split("\n"); 
			
			FileOutputStream fos = new FileOutputStream("student_output.txt");
						
			for(String line: lines) {
//				System.out.println(line);
				String[] data = line.split(",");
				int id = Integer.parseInt(data[0].trim());
				int sub1 = Integer.parseInt(data[3].trim());
				int sub2 = Integer.parseInt(data[4].trim());
				int sub3 = Integer.parseInt(data[5].trim());
				Student s1 = new Student(id, data[1].trim(), data[2].trim(),sub1,sub2,sub3);
				
				fos.write(s1.toCSV().getBytes());
				
			}
						
			fis.close();
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
