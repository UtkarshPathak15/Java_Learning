package com.techmojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techmojo.beans.Person;
import com.techmojo.service.PersonService;

public class App {
  public static void main(String[] args) {
	  
    ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
    PersonService personService = ctxt.getBean(PersonService.class);
    Person p1 = new Person(101,"Utkarsh","utkarsh.pathak15@gmail.com");
    personService.save(p1);
    System.out.println("Search 999 : "+personService.find(999));
  }
}
