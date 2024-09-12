package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller1 {
	
	@Autowired
	RestTemplate template;
	
	private String endpoint="http://localhost:1111/hello2";
	
	@GetMapping(value = "/hello1")
	public String hello1() {
		return template.getForObject(endpoint, String.class);
	}
	

}
