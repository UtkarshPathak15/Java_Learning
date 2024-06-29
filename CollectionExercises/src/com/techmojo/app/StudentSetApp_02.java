package com.techmojo.app;

import java.util.HashSet;
import java.util.TreeSet;

import com.techmojo.beans.Student;
import com.techmojo.beans.StudentNameComparator;

public class StudentSetApp_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> students = new HashSet<Student>();
		students.add(new Student(102, "Utkarsh", "utkarsh15@gmail.com"));
		students.add(new Student(101, "Pathak", "pathak159@gmail.com"));
		students.add(new Student(103, "Lokesh", "lokesh17@gmail.com"));
		students.add(new Student(104, "Abhijeet", "abhijeet15@gmail.com"));
		students.add(new Student(105, "Sharma", "sharma15@gmail.com"));
		students.add(new Student(105, "Sharma", "sharma15@gmail.com"));
		students.add(new Student(105, "Abhijeet", "abhijeet15@gmail.com"));
		students.add(new Student(105, "Sharma", "sharma15@gmail.com"));
		
		
		Student s1 = new Student(145, "Shaam", "shaam10@gmail.com");
		students.add(s1);
		students.add(s1);
		
		System.out.println("No. of students in the Set : "+students.size());
		
		System.out.println("students existing :");
		for(Student student :students) {
			System.out.println(student);
		}
		
		System.out.println("End of the Program");

	}

}
