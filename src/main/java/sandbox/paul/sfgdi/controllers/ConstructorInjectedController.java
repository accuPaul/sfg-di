package sandbox.paul.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sandbox.paul.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    @Autowired      // (Autowired is optional in Spring 5)
    public ConstructorInjectedController(@Qualifier("I18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
