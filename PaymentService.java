package com.cms.collgmangsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.collgmangsystem.entity.Payment;
import com.cms.collgmangsystem.repository.PaymentRepository;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment makePayment(Payment payment) {
        // Implement payment processing logic using jdbcTemplate
        return paymentRepository.save(payment);
    }
    
}
