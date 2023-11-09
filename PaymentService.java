package com.anand.razorpay.service;

import java.math.BigDecimal;

import com.anand.razorpay.model.Payment;

public interface PaymentService {
    Payment createPayment(BigDecimal amount);

}


