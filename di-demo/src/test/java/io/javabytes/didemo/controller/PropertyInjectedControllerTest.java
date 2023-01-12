package io.javabytes.didemo.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.javabytes.didemo.services.GreetingServiceImpl;

class PropertyInjectedControllerTest {

	private PropertyInjectedController controller;
	@BeforeEach
	void setUp() throws Exception {
		controller = new PropertyInjectedController();
		controller.service = new GreetingServiceImpl();
	}

	@Test
	void testGreetings() {
		assertEquals("Hello World", controller.greetings());
	}

}
