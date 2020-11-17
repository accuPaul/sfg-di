package sandbox.paul.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import sandbox.paul.sfgdi.services.GreetingService;

@Controller
public class I18NController {

    private final GreetingService greetingService;

    public I18NController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
