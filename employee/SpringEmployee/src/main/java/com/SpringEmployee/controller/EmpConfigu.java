package com.SpringEmployee.controller;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class EmpConfigu {

@Bean
public RestTemplate gettemplate() {
		
		RestTemplate resttemplate=new RestTemplate();
		return resttemplate;
	}
}
