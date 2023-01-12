package io.javabytes.didemo.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.javabytes.didemo.services.GreetingServiceImpl;

class ConstructorInjectionControllerTest {

	private ConstructorInjectionController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		
		controller = new ConstructorInjectionController(new GreetingServiceImpl());
	}

	@Test
	void testGreetingMsg() {
		
		assertEquals("Hello World", controller.greetings());
	}

}
