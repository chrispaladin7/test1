package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;


import static java.time.Month.DECEMBER;
import static java.time.Month.JULY;


@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){

        return args -> {
           Student Ken= new Student(
                     1L,
                    "ken",
                    "ken.master@yahoo.com",
                    LocalDate.of(2000, JULY,5)


            );

            Student Nelly= new Student(
                    30L,
                    "Nelly",
                    "Nelly.kool@gmail.com",
                    LocalDate.of(1990, DECEMBER,5)


            );

            repository.saveAll(
                    List.of(Ken,Nelly)
            );
        };


    }

}
