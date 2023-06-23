package com.example.javatest.repositories;

import com.example.javatest.entities.First;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FirstRepository extends JpaRepository<First, UUID> {
}
