package io.javabytes.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import io.javabytes.didemo.controller.ConstructorInjectionController;
import io.javabytes.didemo.controller.DiController;
import io.javabytes.didemo.controller.PropertyInjectedController;
import io.javabytes.didemo.controller.SetterInjectionController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
	
	DiController diController = ctx.getBean("diController", DiController.class);
	
	System.out.println("Message returned is "+diController.getMessage());
	
	System.out.println("------ Property");
	PropertyInjectedController propertyInjectedController =  ctx.getBean("propertyInjectedController",PropertyInjectedController.class);
	System.out.println(propertyInjectedController.greetings());

	System.out.println("--------- Setter");
	SetterInjectionController setterInjectionController =  ctx.getBean("setterInjectionController",SetterInjectionController.class);
	System.out.println(setterInjectionController.greetings());

	System.out.println("-------- Constructor" );
	ConstructorInjectionController constructorInjectionController =  ctx.getBean("constructorInjectionController",ConstructorInjectionController.class);
	System.out.println(constructorInjectionController.greetings());
	}

}
