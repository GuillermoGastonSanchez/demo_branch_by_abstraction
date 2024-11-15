package com.example.repository;

import com.example.entity.Greeting;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// new version
public class AdvancedGreetingRepository implements GreetingRepository {
    private Map<Long, Greeting> greetings = new HashMap<>();


    @Override
    public List<Greeting> findAll() {
        if(greetings.isEmpty()){
            Greeting greeting = new Greeting(1L, "Hello, World Advance!");
            greetings.put(greeting.getId(), greeting);
        }
        return greetings.values().stream().collect(Collectors.toList());
    }

    @Override
    public Greeting findById(Long id) {
        return greetings.get(id);
    }

    @Override
    public void save(Greeting greeting) {
        greetings.put(greeting.getId(), greeting);
    }
    public void getinfo(){
     // TODO
    }
}