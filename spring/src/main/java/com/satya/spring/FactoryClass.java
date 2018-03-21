package com.satya.spring;

import org.springframework.context.support.StaticApplicationContext;

public class FactoryClass {

		public static Person getPerson()
		{
			Person person=new Person();
			return person;		
			}

		public static Address getAddress()
		{
			Address address =new Address();
			return address;
		}
	}


