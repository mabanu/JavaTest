package com.example.javatest.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
public class FirstTestClass {

    @NotBlank
    @NotNull
    private UUID id;

    @NotBlank
    @NotNull
    private String name;
}
