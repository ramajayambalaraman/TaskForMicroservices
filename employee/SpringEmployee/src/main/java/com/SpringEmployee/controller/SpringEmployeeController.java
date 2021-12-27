package com.SpringEmployee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringEmployee.Service.EmployeeService;
import com.SpringEmployee.model.SpringEmployeeService;

@RestController
public class SpringEmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	@RequestMapping("/api/employee")
	public SpringEmployeeService showemployee() {
		
		
		SpringEmployeeService se=new SpringEmployeeService();
		
		String name=employeeService.getcallme();
		
	//	int s=employeeService.getsalary();
		
		se.setName(name);
		se.setSalary(12345);
		return se;
	}

}
