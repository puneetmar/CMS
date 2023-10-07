package com.gitm.collegemanagementsystem.controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gitm.collegemanagementsystem.entity.Payment;
import com.gitm.collegemanagementsystem.service.PaymentService;

@Controller
public class PaymentController {

      @Autowired
    private PaymentService paymentService;

    @PostMapping("/pay")
    public String makePayment(@RequestParam Long candidateId, @RequestParam double amount) {
             // Handle payment form submission
        Payment payment = paymentService.makePayment(candidateId, amount);
        // Redirect to a success page or display a message
        return "redirect:/success"; // Redirect to a success page

    }
    
    @GetMapping("/payments")
    public String getPayments(@RequestParam Long candidateId, Model model) {
        // Handle displaying payments for a candidate
        List<Payment> payments = paymentService.getPaymentsByCandidateId(candidateId);
        model.addAttribute("payments", payments);
        // Display the payments in the response or redirect to a payments page
        return "payments"; // Return the view name for displaying payments
    }
    
}
