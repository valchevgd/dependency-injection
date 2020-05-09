package com.github.valchevgd.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    public ConstructorGreetingService() {
        System.out.println("Create ConstructorGreetingService");
    }

    @Override
    public String sayGreeting() {
        return "Hello World! - from Constructor";
    }
}
