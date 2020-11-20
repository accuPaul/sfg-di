package sandbox.paul.sfgdi.services;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch(lang){
            case "en":
                return new PrimaryGreetingService();//greetingRepository);
            case "fr":
                return new PrimaryGreetingService();//greetingRepository);
            case "es":
                return new PrimaryGreetingService();//greetingRepository);
            default:
                return new PrimaryGreetingService();//greetingRepository);

        }
    }
}
