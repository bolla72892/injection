package com.satya.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(Person.class);
    ApplicationContext container=	new ClassPathXmlApplicationContext("spring.xml");
    	Person person=FactoryClass.getPerson();
    	Address address=FactoryClass.getAddress();
    	person.display();
    	//FactoryClass.getAddress();
    	((AbstractApplicationContext)container).close();
    	
            }
}
