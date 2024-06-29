package com.techmojo.app;

import java.util.LinkedList;

public class LinkedListDemo_01 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Utkarsh");
		list.add("Pathak");
		list.add("Shub");
		list.add("Nandu");
		list.add("Lokesh");
		list.add("Sharma");
		int noList = list.size();
		System.out.println(noList+" added in the List.");
		for(int i=0;i<noList;i++) {
			System.out.println("Name at the index "+i+" is "+list.get(i));
		}
		
		System.out.println("");

		for(String list1 : list) {
			System.out.println(list1);
		}
		
		System.out.println("");
		list.push("Lokesh");
		list.push("Abhijeet");
		System.out.println("After pushing elements");
		for(int i=0;i<noList;i++) {
			System.out.println("Name at the index "+i+" is "+list.get(i));
		}
		
		System.out.println("");
		
		list.addFirst("Pathak");
		list.addLast("Utkarsh");
		
		for(String list1 : list) {
			System.out.println(list1);
		}
		
		System.out.println("");
		System.out.println("After popping elements");
		String s1 = list.pop();
		String s2 = list.pop();
		
		System.out.println("Popped Strings : "+s1+" and "+s2);
		for(String list1 : list) {
			System.out.println(list1);
		}
		
		
	}

}
