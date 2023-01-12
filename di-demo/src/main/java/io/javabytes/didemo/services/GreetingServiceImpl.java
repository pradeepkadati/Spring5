package io.javabytes.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

	@Override
	public String greetingMsg() {
		
		return "Hello World";
	}

}
