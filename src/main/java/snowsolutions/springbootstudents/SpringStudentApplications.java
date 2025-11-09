package ru.corse.springbootstudents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class SpringStudentApplications {

    public static void main(String[] args) {
        SpringApplication.run(SpringStudentApplications.class, args);
    }

}
