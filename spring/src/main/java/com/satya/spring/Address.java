package com.satya.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//@ComponentScan
@Configuration
public class Address {
@Value("hyd")
	private String city;
	
	public Address()
	{
		System.out.println("address obj ");
	}


	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String toString() {
		return "Address [city=" + city + "]";
}
}
