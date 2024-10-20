package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.*;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{

            Student mariam=new Student(
                "Mariam",
                "mariam.jamal@gmail.com",
                LocalDate.of(2000, Month.JANUARY, 5),
                21
            );

            Student alex=new Student(
                "Alex",
                "alex@gmail.com",
                LocalDate.of(2004, Month.JANUARY, 5),
                18
            );
            repository.saveAll(
                List.of(mariam,alex)
            );
            
        };
    }
}
