package com.example.spring_angular_app;

import com.example.spring_angular_app.entity.Payment;
import com.example.spring_angular_app.entity.Student;
import com.example.spring_angular_app.enumeration.PaymentStatus;
import com.example.spring_angular_app.enumeration.PaymentType;
import com.example.spring_angular_app.repository.PaymentRepository;
import com.example.spring_angular_app.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;

@SpringBootApplication
public class SpringAngularAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAngularAppApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository, PaymentRepository paymentRepository) {
		return args -> {
			studentRepository.save(Student.builder()
					.id(UUID.randomUUID().toString())
					.firstName("Abderaouf")
					.lastName("Souissi")
					.code("1234")
					.programId("CS")
					.build()
			);
			studentRepository.save(Student.builder()
					.id(UUID.randomUUID().toString())
					.firstName("Zahr")
					.lastName("Hammemi")
					.code("1122")
					.programId("CS")
					.build()
			);
			studentRepository.save(Student.builder()
					.id(UUID.randomUUID().toString())
					.firstName("Mounir")
					.lastName("Oueslati")
					.code("3344")
					.programId("IRS")
					.build()
			);studentRepository.save(Student.builder()
					.id(UUID.randomUUID().toString())
					.firstName("Ghaith")
					.lastName("Chebbi")
					.code("4455")
					.programId("CS")
					.build()
			);
			Random random = new Random();
			PaymentType[] paymentTypes = PaymentType.values();
			studentRepository.findAll().forEach(
					student -> {
						for(int i=0;i<10;i++){
							int index = random.nextInt(paymentTypes.length);
							Payment payment = Payment.builder()
									.amount(new Random().nextInt(100))
									.type(paymentTypes[index])
									.status(PaymentStatus.CREATED)
									.date(LocalDate.now())
									.student(student)
									.build();
							paymentRepository.save(payment);

						}
					}
			);


		};
	}


}
