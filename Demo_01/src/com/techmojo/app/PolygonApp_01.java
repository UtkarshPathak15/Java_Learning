package com.techmojo.app;

import com.techmojo.beans.Polygon;
import com.techmojo.beans.Rectangle;
import com.techmojo.beans.Triangle;

public class PolygonApp_01 {

	public static void main(String[] args) {
		Polygon p;
		p = new Triangle(12.5, 24.4);
		System.out.println("Area of Triangle : "+p.getArea());
		p = new Rectangle(12.5, 24.4);
		System.out.println("Area of Reactangle : "+p.getArea());
//		Polygon x = new Polygon(5,8); //abstract class -> object can't be created ( helps since area can't be zero)
//		System.out.println("Area of Polygon : "+x.getArea()); 
		

	}
	
 
}
