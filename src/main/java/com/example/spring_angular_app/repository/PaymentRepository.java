package com.example.spring_angular_app.repository;

import com.example.spring_angular_app.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
