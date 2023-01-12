package io.javabytes.didemo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class DiController {

	public String getMessage() {

		System.out.println("Di-Controller Message");
		return "Hello Buddy";
	}
}
