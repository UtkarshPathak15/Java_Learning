package com.techmojo.beans;

public class Rectangle extends Polygon {

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(double length, double breadth) {
		super(length, breadth);
		// TODO Auto-generated constructor stub
	}
	
	public double getArea() {
		double area;
		area = x*y;
		return area;
	}

}
