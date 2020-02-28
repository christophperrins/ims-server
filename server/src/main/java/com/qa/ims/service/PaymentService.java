package com.qa.ims.service;

import org.springframework.stereotype.Service;

import com.qa.ims.dto.order.Payment;

@Service
public class PaymentService {

	public boolean processPayment(Payment payment) {
		return payment.isPay();
	}
}
