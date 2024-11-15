package com.example.service;

import com.example.entity.Greeting;
import java.util.List;

public interface GreetingService {
    List<Greeting> getAllGreetings();
    Greeting getGreetingById(Long id);
    void addGreeting(Greeting greeting);
}