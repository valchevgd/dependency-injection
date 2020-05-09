package com.github.valchevgd.dependencyinjection.controllers;

import com.github.valchevgd.dependencyinjection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
        System.out.println("Create MyController");
    }

    public String sayHallo() {
        return greetingService.sayGreeting();
    }
}
