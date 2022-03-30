package com.avery.springboot.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(
        path = "api/students"
)
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
        return StudentService.getStudents();
    }

}
