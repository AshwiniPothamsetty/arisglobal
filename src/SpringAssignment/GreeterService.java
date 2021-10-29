package com.aris.SpringAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class GreeterService {
	@Autowired
//	 @Qualifier("morningGreeting")
	 private Greeting greeting;

	public Greeting getGreeting() {
		return greeting;
	}

	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}

	public GreeterService() {
		super();
		//this.greeting = greeting;
	}
	public void printGreeting() {
		System.out.println("Greeting:"+greeting.greet());
	}
	}



