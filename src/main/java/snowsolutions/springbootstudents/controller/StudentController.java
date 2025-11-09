package ru.corse.springbootstudents.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.corse.springbootstudents.model.Student;

@Controller("/")
@RequestMapping("/api/v1/students")
public class StudentController {
    public <List> findAllStudents() {
        return List.of(
                Student.builder().name("Олег").email("mail@mail.com").age(34)
        );
    }

}
