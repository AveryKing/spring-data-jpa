package com.avery.springboot.student;

import java.time.LocalDate;
import java.util.List;

public class StudentService {
    public static List<Student> getStudents() {
        return List.of(new Student(
                "Avery",
                "aking13@wmich.edu",
                LocalDate.of(2000,9,8),
                21
        ));
    }
}
