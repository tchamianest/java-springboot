package com.example.demo;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.*;

import com.example.demo.student.Student;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Student> getStudents(){
		return List.of( 
			new Student(
				1L,
				"Kalisa daniel",
				"tchamianest@gmail.com",
				LocalDate.of(2000, Month.JANUARY, 5),
				21
			)
		);
	}

}
