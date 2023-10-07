package com.gitm.collegemanagementsystem.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gitm.collegemanagementsystem.entity.Payment;
import com.gitm.collegemanagementsystem.repository.PaymentRepository;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;
    
    public Payment makePayment(Long candidateId, double amount) {
         Payment payment = new Payment();
        payment.setCandidateId(candidateId);
        payment.setAmount(amount);
        payment.setPaymentDate(LocalDateTime.now()); // Set the current date and time
        // Save the payment to the database
        return paymentRepository.save(payment);
    }
    
    public List<Payment> getPaymentsByCandidateId(Long candidateId) {
        return paymentRepository.findByCandidateId(candidateId);

    }
    
    // Other payment-related methods
    
}
