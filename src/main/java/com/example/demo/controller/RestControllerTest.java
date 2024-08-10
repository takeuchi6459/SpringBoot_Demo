package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerTest {
    
	@GetMapping("/api")
	public String requestMethodName() {
		return new String("Hello world!!!!!!!");
	}

}
