package sandbox.paul.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sandbox.paul.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController {

    @Qualifier("I18nService")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
