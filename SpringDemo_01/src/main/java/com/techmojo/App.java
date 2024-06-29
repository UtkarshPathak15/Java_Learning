package com.techmojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techmojo.beans.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
    	ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
    	Person person = (Person)ctxt.getBean("person");
//    	Person person2 = (Person)ctxt.getBean("person");
//    	if(person1==person2) {
//    		System.out.println("Single Instance");
//    	}
//    	else {
//    		System.out.println("Different Instances");
//    	}
//        Person person = new Person(101, "Utkarsh", "utkarsh15@gmail.com");

    }
}
