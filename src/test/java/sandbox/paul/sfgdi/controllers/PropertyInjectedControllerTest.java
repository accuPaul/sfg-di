package sandbox.paul.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sandbox.paul.sfgdi.services.EnglishGreetingService;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new EnglishGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }

}