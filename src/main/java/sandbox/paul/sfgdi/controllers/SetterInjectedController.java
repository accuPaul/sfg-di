package sandbox.paul.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sandbox.paul.sfgdi.services.GreetingService;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(@Qualifier("I18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
