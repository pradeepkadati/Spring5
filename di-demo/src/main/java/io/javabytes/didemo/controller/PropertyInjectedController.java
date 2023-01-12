package io.javabytes.didemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import io.javabytes.didemo.services.GreetingService;

@Controller
public class PropertyInjectedController {
	
	@Autowired
	public GreetingService service;
	
	public String greetings() {
		System.out.println(service.greetingMsg());
		return service.greetingMsg();
	}
}
