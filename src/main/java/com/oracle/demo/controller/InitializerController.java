package com.oracle.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitializerController {
	
	@GetMapping(value = "/isAvailable" , produces = MediaType.APPLICATION_JSON_VALUE)
	public String isAvailable() {
		return "Service has started successfully!";
	}

}
