package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student rehan = new Student(
                    "Rehan",
                    "rehanzuberi@icloud.com",
                    LocalDate.of(2001, Month.MARCH, 8)
            );

            Student david = new Student(
                    "David",
                    "davidbonthond22@gmail.com",
                    LocalDate.of(2001, Month.OCTOBER, 22)
            );

            repository.saveAll(
                    List.of(rehan, david)
            );
        };
    }
}
