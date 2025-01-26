package com.example.spring_angular_app.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor @NoArgsConstructor @Builder
@Getter @Setter @ToString
@Entity
public class Student {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String code;
    private String programId;
    private String photoUrl;





}
