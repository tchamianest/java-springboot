package com.example.demo.student;

import java.time.*;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
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
