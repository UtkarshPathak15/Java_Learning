package com.techmojo.app;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.techmojo.beans.Student;

public class SerializeDemo_01 {

	public static void main(String[] args) {
		Student student = new Student(101, "Utkarsh", "utkarsh15@gmail.com", 100, 99, 100);
		System.out.println("Started Serializing");
		try {
			FileOutputStream fos = new FileOutputStream("student.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(student);
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End of the Program");	

	}

}
