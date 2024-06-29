package com.techmojo.service;

import org.springframework.stereotype.Service;

import com.techmojo.beans.Person;

@Service
public class PersonDBService implements PersonService{

	@Override
	public void save(Person p) {
		// TODO Auto-generated method stub
		System.out.println("Saving thr person in DB : "+p);
		
	}

	@Override
	public Person find(int id) {
		// TODO Auto-generated method stub
		System.out.println("Finding a person from DB with id : "+id);
		return new Person(101,"UtkarshDB","utkarshDB15@gmail.com");
	}

}
