package com.example.javatest.services;

import com.example.javatest.entities.First;
import com.example.javatest.model.FirstTestClass;
import com.example.javatest.repositories.FirstRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class FirstServiceImpl implements FirstService {


    private final FirstRepository firstRepository;

    public FirstServiceImpl(FirstRepository firstRepository) {

        this.firstRepository = firstRepository;
    }

    @Override
    public List<FirstTestClass> getFirst() {
        List<First> firstResult = firstRepository.findAll();

        List<FirstTestClass> result = new ArrayList<>();
        firstResult.forEach(row -> {
            FirstTestClass item = new FirstTestClass(row.getId(), row.getName());
            result.add(item);
        });

        return result;
    }
}
