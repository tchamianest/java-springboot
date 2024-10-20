package com.example.demo.student;

import java.time.*;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	private final StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository){
		this.studentRepository=studentRepository;
	}
	public List<Student> getStudents(){
		return studentRepository.findAll();
	}

}
