package com.techmojo.app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TreeMap;
import java.util.TreeSet;

import com.techmojo.beans.Student;
import com.techmojo.beans.StudentComparator;

public class StudentSetApp_01 {

	public static void main(String[] args) {
		TreeSet<Student> students = new TreeSet<Student>(new StudentComparator());
		students.add(new Student(102, "Utkarsh", "utkarsh15@gmail.com"));
		students.add(new Student(101, "Pathak", "pathak159@gmail.com"));
		students.add(new Student(103, "Lokesh", "lokesh17@gmail.com"));
		students.add(new Student(104, "Abhijeet", "abhijeet15@gmail.com"));
		students.add(new Student(105, "Sharma", "sharma15@gmail.com"));
		
		students.add(new Student(105, "Abhijeet", "abhijeet15@gmail.com"));
		students.add(new Student(104, "Sharma", "sharma15@gmail.com"));
		
		System.out.println("No. of students in the Set : "+students.size());
		
		System.out.println("students existing :");
		for(Student student :students) {
			System.out.println(student);
		}
		
		
		TreeMap<Integer, Student> map = new TreeMap<Integer, Student>();
		for(Student student :students) {
			map.put(student.getId(), student);
		}
		
		for(Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        } 
		System.out.println("End of the Program");
		
		String str = "Utkarsh,Pathak,Lokesh,Sharma,Abhijeet,Renge";
		String[] arrStr = str.split(",",0);
		for(String s: arrStr)
			System.out.println(s);
		
		
		

	}

}
