package com.example.demo.Controller;

import com.example.demo.entity.student.Student;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
    private static final List<Student> STUDENT = Arrays.asList(
            new Student(1, "James"),
            new Student(2, "James 1"),
            new Student(3, "James 2")
    );

    @GetMapping(path = "{studentId}")
    public Student getStudent(@PathVariable("studentId") Integer studentId) {
        return STUDENT.stream()
                .filter(s -> studentId.equals(s.getStudentid()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Student " + studentId + "  does not exist"));
    }

}
