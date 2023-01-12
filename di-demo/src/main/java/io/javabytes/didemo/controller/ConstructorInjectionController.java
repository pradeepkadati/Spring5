package io.javabytes.didemo.controller;

import org.springframework.stereotype.Controller;

import io.javabytes.didemo.services.GreetingService;

@Controller
public class ConstructorInjectionController {

	private GreetingService service;
	
	public ConstructorInjectionController(GreetingService service) {
		this.service = service;
	}

	public String greetings() {
		System.out.println(service.greetingMsg());
		return service.greetingMsg();
	}
}
