package com.fis.service;

public class PaymentServiceImpl implements PaymentService {

	@Override
	public void makePayment(int paymentAmt) {
		System.out.println(paymentAmt + " Debited");
		System.out.println(paymentAmt + " Credited");

	}

}
