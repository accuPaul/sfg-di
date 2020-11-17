package sandbox.paul.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sandbox.paul.sfgdi.services.EnglishGreetingService;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService((new EnglishGreetingService()));
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}