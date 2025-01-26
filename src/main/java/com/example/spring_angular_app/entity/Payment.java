package com.example.spring_angular_app.entity;

import com.example.spring_angular_app.enumeration.PaymentStatus;
import com.example.spring_angular_app.enumeration.PaymentType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@AllArgsConstructor @NoArgsConstructor @Builder
@Getter @Setter @ToString
@Entity
public class Payment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private double amount;
    @Enumerated(EnumType.STRING)
    private PaymentType type;
    @Enumerated(EnumType.STRING)
    private PaymentStatus status;
    private String file;
    @ManyToOne
    private Student student;

}
