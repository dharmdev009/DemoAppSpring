package com.example.demo;


import java.util.concurrent.atomic.AtomicLong;

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

	private static final String templates = "Hello , %s";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(method = RequestMethod.GET)
	public Greeting greeting(@RequestParam(value="name", defaultValue="dharm dev") String name) {
		
		return new Greeting(counter.incrementAndGet(), String.format(templates, name));
		
	}
}
