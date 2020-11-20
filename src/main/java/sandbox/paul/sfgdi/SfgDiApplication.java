package sandbox.paul.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import sandbox.paul.sfgdi.controllers.ConstructorInjectedController;
import sandbox.paul.sfgdi.controllers.MyController;
import sandbox.paul.sfgdi.controllers.PropertyInjectedController;
import sandbox.paul.sfgdi.controllers.SetterInjectedController;
import sandbox.paul.sfgdi.examplebeans.FakeDataSource;
import sandbox.paul.sfgdi.examplebeans.FakeJmsBroker;

@SpringBootApplication
//@ComponentScan(basePackages = {"sandbox.paul.sfgdi"})
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource =(FakeDataSource) ctx.getBean(FakeDataSource.class);
		FakeJmsBroker jmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);

		System.out.println(myController.sayHello()+", "+fakeDataSource.getUser());
		System.out.println(myController.sayHello()+", "+jmsBroker.getUser());

		/*System.out.println("===== Primary Bean =====");
		System.out.println(myController.sayHello());


		System.out.println("===== Property Injection =====");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("===== Setter Injection =====");

		SetterInjectedController setterInjectedController  = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("===== Constructor Injection =====");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());*/



	}

}
