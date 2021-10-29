package com.aris.SpringAssignment;

import org.springframework.stereotype.Component;

@Component
public class MorningGreeting implements Greeting {


	private String Greeting="Good Morning";
	
	
	public String getGreeting() {
		return Greeting;
	}


	public void setGreeting(String greeting) {
		this.Greeting = greeting;
	}
		public MorningGreeting() {
			super();
	}


	public String greet() {
				return Greeting;
	}

}
