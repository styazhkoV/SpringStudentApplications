package snowsolutions.springbootstudents.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/students")
    public List<Object> findAllStudents() {
        return List.of(new <snowsolutions.springbootstudents.controller.StudentController>) 1L, "John", "Doe", "john@example.com", 20));
    }
}