package com.example.javatest.controller;

import com.example.javatest.model.FirstTestClass;
import com.example.javatest.services.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class FirstController {

    public static final String FIRST_CONTROLLER_PATH = "/api/v1/first";
    private final FirstService firstService;

    @Autowired
    public FirstController(FirstService firstService) {
        this.firstService = firstService;
    }

    @GetMapping(FIRST_CONTROLLER_PATH)
    public List<FirstTestClass> GetFirst() {
        return firstService.getFirst();
    }
}
