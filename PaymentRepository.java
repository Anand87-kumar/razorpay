package com.anand.razorpay.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.anand.razorpay.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}

