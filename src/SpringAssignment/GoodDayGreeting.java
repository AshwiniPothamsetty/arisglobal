package com.aris.SpringAssignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

@Primary

public class GoodDayGreeting implements Greeting {
	private String Greeting="Have a good day";

	public String getGreeting() {
		return Greeting;
	}

	public void setGreeting(String greeting) {
		this.Greeting = greeting;
	}

	public GoodDayGreeting() {
		super();
		
	}

	
	 public String greet() {
		  return Greeting; 

	}

}
