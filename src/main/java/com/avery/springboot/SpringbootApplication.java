package com.avery.springboot;

import com.avery.springboot.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

    @GetMapping
    public List<Student> hello() {
        return List.of(new Student(
                "Avery",
                "aking13@wmich.edu",
                LocalDate.of(2000,9,8),
                21
        ));
    }
}
