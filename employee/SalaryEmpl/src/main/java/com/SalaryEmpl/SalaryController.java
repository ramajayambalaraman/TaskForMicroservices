package com.SalaryEmpl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalaryController {

	
	
	@GetMapping
	@RequestMapping("/api/salary")
	public int salaryshow() {
		
		
		return 567948;
	}
}
