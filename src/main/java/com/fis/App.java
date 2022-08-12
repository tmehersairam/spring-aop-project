package com.fis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.service.PaymentService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/fis/config.xml");
		PaymentService paymentService = context.getBean("paymentServiceImpl", PaymentService.class);
		paymentService.makePayment(100);
	}
}
