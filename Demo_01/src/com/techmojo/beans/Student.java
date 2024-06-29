package com.techmojo.beans;

public class Student {
	int id;
	String name;
	int sub1;
	int sub2;
	int sub3;
		
	public Student() {
		super(); //explicitly declared -> if not, it is implicit.   
	}
	
	public Student(int id, String name, int sub1, int sub2, int sub3) {
		super(); //explicitly declared -> if not, it is implicit.
		this.id = id;
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSub1() {
		return sub1;
	}

	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}

	public int getSub3() {
		return sub3;
	}

	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	
	public int getTotal() {
		int tot;
		tot = sub1 + sub2 + sub3;
		return tot;
	}
	
	public double getAverage() {
		int tot = getTotal();
		double avg = ((double)tot)/3;
		return avg;
		
	}

}
