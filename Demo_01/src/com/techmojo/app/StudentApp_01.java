package com.techmojo.app;

import com.techmojo.beans.Student;

public class StudentApp_01 {

	public static void main(String[] args) {
		Student student1 = new Student(101, "Utkarsh", 99, 99, 100);
		Student student2 = new Student();
		student2.setId(102);
		student2.setName("Pathak");
		student2.setSub1(99);
		student2.setSub2(100);
		student2.setSub3(100);
		
		System.out.println("Name : "+student1.getName()+", total : "+
							student1.getTotal()+" and average : "+
							student1.getAverage());
		
		System.out.println("Name : "+student2.getName()+", total : "+
				student2.getTotal()+" and average : "+
				student2.getAverage());

	}

}
