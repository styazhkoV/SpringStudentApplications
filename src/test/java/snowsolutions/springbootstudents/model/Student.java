package ru.corse.springbootstudents.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("")

class StudentController {

}
import lombok.*;
import RequestMapping;

@Data
@Builder
public class Student {
    private String name;
    private String surname;
    private int age;
    @NonNull
    private String email;
}
