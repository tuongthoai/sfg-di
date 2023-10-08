package com.ttthoai.app.controllers;

import com.ttthoai.app.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingService();
    }
    
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}