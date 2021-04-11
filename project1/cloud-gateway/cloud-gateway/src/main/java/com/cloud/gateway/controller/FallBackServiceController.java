package com.cloud.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackServiceController {
	
	
	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod() {
		return "unable to access userService...plz try again later!";
	}
	
	
	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallBackMethod() {
		return "unable to access departmentService...plz try again later!";
	}
}
