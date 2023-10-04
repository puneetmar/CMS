package com.cms.collgmangsystem.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cms.collgmangsystem.entity.Payment;

@Repository
public class PaymentRepository {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Payment save(Payment payment) {
        return null;
    }

    // Implement methods for payment data access
}

