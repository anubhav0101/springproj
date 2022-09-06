package com.beehyv.springDemo.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.beehyv.springDemo.response.HelloResposne;

@RestController
public class AppController {
	@GetMapping("/printHello/{name}")
	public String print(@PathVariable String name) {
		return " Hello " + name;
	}

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/helloWorld")
	public ResponseEntity<?> helloWorld(@RequestParam String print) {
		HelloResposne res = new HelloResposne();
		res.setId(counter.incrementAndGet());
		res.setPrint("hello " + print);
		return new ResponseEntity<HelloResposne>(res, HttpStatus.ACCEPTED);
	}

}
