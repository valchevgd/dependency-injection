package com.github.valchevgd.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    public SetterGreetingService() {
        System.out.println("Create SetterGreetingService");
    }

    @Override
    public String sayGreeting() {
        return "Hello World! - from Setter";
    }
}
