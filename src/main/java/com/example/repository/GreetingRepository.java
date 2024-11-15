package com.example.repository;

import java.util.List;

import com.example.entity.Greeting;

public interface GreetingRepository {
    List<Greeting> findAll();
    Greeting findById(Long id);
    void save(Greeting greeting);
    
}
