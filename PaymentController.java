package com.cms.collgmangsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cms.collgmangsystem.entity.Payment;
import com.cms.collgmangsystem.service.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {

            
 @Autowired
    private PaymentService paymentService;

    @PostMapping("/pay")
    public ResponseEntity<Payment> makePayment(@RequestBody Payment payment) {
        Payment paidPayment = paymentService.makePayment(payment);
        return ResponseEntity.ok(paidPayment);
    }
    
}
