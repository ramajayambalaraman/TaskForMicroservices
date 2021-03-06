package com.SpringEmployee.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class EmployeeService {

	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private CircuitBreakerFactory circuitBreakerFactory;
	
	
	public String getcallme() {
		
     CircuitBreaker cb=circuitBreakerFactory.create("serviceemployee");
  
     return cb.run(()->restTemplate.getForObject("http://localhost:8082/api/name", String.class),throwable -> namecallback());
  
	//String name=restTemplate.getForObject("http://localhost:8082/api/name", String.class);
	//return name;	
	}
	
public String namecallback() {
	
	return " invaild link ";
}


}
