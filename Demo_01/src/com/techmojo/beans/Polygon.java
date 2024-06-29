package com.techmojo.beans;

abstract public class Polygon {
	
	double x;
	double y;
	
	
	public Polygon() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Polygon(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}


	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	public double getY() {
		return y;
	}


	public void setY(double y) {
		this.y = y;
	}
	
	abstract public double getArea();
	

}
