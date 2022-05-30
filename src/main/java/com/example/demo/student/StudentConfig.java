package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student mathilde =  new Student(
                    "Mathilde",
                    "matdam@gmail.com",
                    LocalDate.of(2000, JANUARY, 5)
            );
            Student jon =  new Student(
                    "jon",
                    "jondoe@gmail.com",
                    LocalDate.of(2000, FEBRUARY, 5)
            );

            repository.saveAll(List.of(mathilde, jon));
        };
    }
}
