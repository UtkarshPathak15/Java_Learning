package com.techmojo.service;

import org.springframework.stereotype.Component;

import com.techmojo.beans.Person;

//@Component
public class PersonFileService implements PersonService{

	@Override
	public void save(Person p) {
		// TODO Auto-generated method stub
		System.out.println("Saving the person : "+p);
		
	}

	@Override
	public Person find(int id) {
		// TODO Auto-generated method stub
		System.out.println("Finding a person with id : "+id);
		return new Person(101,"Utkarsh","utkarsh15@gmail.com");
	}

}
