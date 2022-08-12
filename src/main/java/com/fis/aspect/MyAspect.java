package com.fis.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {

	@Before("execution(* com.fis.service.PaymentServiceImpl.makePayment(..))")
	public void printBefore() {
		System.out.println("Authentication: payment started");

	}

	@After("execution(* com.fis.service.PaymentServiceImpl.makePayment(..))")
	public void printAfter() {
		System.out.println("Authentication: payment done");

	}
	
	@Pointcut
	public void print()
	{
		
	}
}
