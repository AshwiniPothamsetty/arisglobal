package com.aris.AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Test2 {
	
	@After("execution(public void test())")

	//@Around("execution(public void test())")
	
	
	public void calc()
	{
		int DA=5;
		int HRD=8;
		int result =DA+HRD; 
		System.out.println(result);

	}
	

}
