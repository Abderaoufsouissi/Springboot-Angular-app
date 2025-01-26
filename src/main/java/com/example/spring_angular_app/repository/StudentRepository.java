package com.example.spring_angular_app.repository;

import com.example.spring_angular_app.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {

}
