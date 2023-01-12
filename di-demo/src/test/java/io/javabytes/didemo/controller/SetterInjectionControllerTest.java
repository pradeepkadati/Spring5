package io.javabytes.didemo.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.javabytes.didemo.services.GreetingServiceImpl;

class SetterInjectionControllerTest {

	private SetterInjectionController controller;
	@BeforeEach
	void setUp() throws Exception {
		controller = new SetterInjectionController();
		controller.setService(new GreetingServiceImpl());
	}

	@Test
	void testGreetings() {
		assertEquals("Hello World", controller.greetings());
	}

}
