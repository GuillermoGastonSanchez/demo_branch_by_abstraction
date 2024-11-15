package com.example.service;

import com.example.entity.Greeting;
import com.example.repository.GreetingRepository;
import java.util.List;

public class SimpleGreetingService implements GreetingService {
    private GreetingRepository greetingRepository;

    public SimpleGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public List<Greeting> getAllGreetings() {
        // logica
        return greetingRepository.findAll();
    }

    @Override
    public Greeting getGreetingById(Long id) {
        return greetingRepository.findById(id);
    }

    @Override
    public void addGreeting(Greeting greeting) {
        greetingRepository.save(greeting);
    }
}