package com.github.valchevgd.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {

    public PropertyGreetingService() {
        System.out.println("Create PropertyGreetingService");
    }

    @Override
    public String sayGreeting() {
        return "Hello World! - from Property";
    }
}
