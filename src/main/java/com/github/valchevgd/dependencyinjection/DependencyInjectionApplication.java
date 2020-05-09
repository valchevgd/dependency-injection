package com.github.valchevgd.dependencyinjection;

import com.github.valchevgd.dependencyinjection.controllers.ConstructorInjectedController;
import com.github.valchevgd.dependencyinjection.controllers.MyController;
import com.github.valchevgd.dependencyinjection.controllers.PropertyInjectedController;
import com.github.valchevgd.dependencyinjection.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

		System.out.println("------ PRIMARY Bean");
		MyController myController = (MyController) context.getBean("myController");

		System.out.println(myController.sayHallo());

		System.out.println("------ Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------ Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------ Constructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());
	}

}
