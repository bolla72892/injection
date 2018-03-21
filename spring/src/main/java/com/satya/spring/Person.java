package com.satya.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan(basePackageClasses= {Address.class,Person.class})
//@ComponentScan
@Configuration
public class Person {
@Value("10")
	private Integer pid;
@Value("satya")
	private String name;

private Address address;
	public Person()
	{
		System.out.println("person obj");
	}
	
	public Address getAddress() {
		return address;
	}
@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	

	public void display()
	{
		System.out.println(pid);
		System.out.println(name);
		System.out.println(address);
	}
}

