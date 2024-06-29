package com.techmojo.app;

import java.util.ArrayList;

public class ArrayListDemo_01 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Utkarsh");
		names.add("Pathak");
		names.add("Shub");
		names.add("Nandu");
		names.add("Lokesh");
		names.add("Sharma");
		int noNames = names.size();
		System.out.println(noNames+" added in the List.");
		for(int i=0;i<noNames;i++) {
			System.out.println("Name at the index "+i+" is "+names.get(i));
		}
		
		for(String name : names) {
			System.out.println(name);
		}
		

	}

}
