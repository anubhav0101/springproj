package com.beehyv.springDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	@GetMapping("/printHello/{name}")
	public String print(@PathVariable String name){
		return " Hello " + name;
	}

	

}


