package com.example.javatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class JavaTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaTestApplication.class, args);
    }
}
