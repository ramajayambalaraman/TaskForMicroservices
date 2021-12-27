package com.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employeecontroller {

	@GetMapping(value = "/welcome")
	public String welcomeCall() {

		return "Welcome to Citi Bank";
	}
	
}
