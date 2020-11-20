package sandbox.paul.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return new PrimaryGreetingService().sayGreeting();
    }

    @Override
    public String getSpanishGreeting() {
        return new SpanishGreetingService().sayGreeting();
    }

    @Override
    public String getFrenchGreeting() {
        return new FrenchGreetingService().sayGreeting();
    }
}
