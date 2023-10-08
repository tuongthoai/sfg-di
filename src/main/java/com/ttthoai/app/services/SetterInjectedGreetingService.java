package com.ttthoai.app.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
//        System.out.println("Hello world");
        return "Greeting - Setter";
    }
}
