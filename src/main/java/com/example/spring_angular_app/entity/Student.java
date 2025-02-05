package com.example.spring_angular_app.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor @NoArgsConstructor @Builder
@Getter @Setter @ToString(callSuper = true)
@Entity
public class Student {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String code;
    private String programId;
    private String photoUrl;
    @OneToMany
    @ToString.Exclude
    private List<Payment> payments = new ArrayList<>();





}
