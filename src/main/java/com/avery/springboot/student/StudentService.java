package com.avery.springboot.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(
                "Avery",
                "aking13@wmich.edu",
                LocalDate.of(2000,9,8),
                21
        ));
    }
}
