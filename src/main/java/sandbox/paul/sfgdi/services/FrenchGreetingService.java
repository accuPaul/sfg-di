package sandbox.paul.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"FR", "default"})
@Service("I18nService")
public class FrenchGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Bonjour a la Monde!";
    }

}
