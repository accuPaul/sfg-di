package sandbox.paul.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import sandbox.paul.sfgdi.controllers.ConstructorInjectedController;
import sandbox.paul.sfgdi.controllers.MyController;
import sandbox.paul.sfgdi.controllers.PropertyInjectedController;
import sandbox.paul.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("===== Primary Bean =====");
		System.out.println(myController.sayHello());


		System.out.println("===== Property Injection =====");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("===== Setter Injection =====");

		SetterInjectedController setterInjectedController  = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("===== Constructor Injection =====");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());



	}

}
