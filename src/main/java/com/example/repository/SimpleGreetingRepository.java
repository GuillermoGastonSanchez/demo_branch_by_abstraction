package com.example.repository;
import java.util.ArrayList;
import java.util.List;

import  com.example.entity.Greeting;

// current version
public class SimpleGreetingRepository implements GreetingRepository {
    // in memory list
    private List<Greeting> greetings = new ArrayList<>();
    
    @Override
    public List<Greeting> findAll(){
        if(greetings.isEmpty()){
            Greeting greeting = new Greeting(1L, "Hello, World!  from simple");
            greetings.add(greeting);
        }
        return greetings;
    }
    
    @Override
    public Greeting findById(Long id){
        for(Greeting greeting : greetings){
            if(greeting.getId().equals(id)){
                return greeting;
            }
        }
        return null;
    }
    
    @Override
    public void save(Greeting greeting){
        greetings.add(greeting);
    }
    
}
