package com.NameEmpl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NameController {
	
	@GetMapping
	@RequestMapping("/api/name")
	public String showemployee() {
		
		
		
		return "HI Name";
	}

}
