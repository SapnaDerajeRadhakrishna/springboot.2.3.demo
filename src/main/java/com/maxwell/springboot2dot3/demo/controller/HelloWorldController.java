package com.maxwell.springboot2dot3.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello World! from spring boot 2.3";
	}

}
