package com.springsecurity.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoResource {
	
	@GetMapping("/")
	public String Home() {
		return "Homee for All";
	}
	
	@GetMapping("/user")
	public String Homeuser() {
		return "Homee for User";
	}
	
	@GetMapping("/admin")
	public String Homeadmin() {
		return "Homee for Admin";
	}
}
