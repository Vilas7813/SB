package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController 
{

	@GetMapping("/hello")
	String m1()
	{
		
		return "Hello vilas22";
	}
	
	
}
