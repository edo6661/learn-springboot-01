package com.edo.quickstart;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 
public class HelloWorldController {
	@Value("${HALO_TEST}")
	private String haloTestEnv;

	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello, user db: " + haloTestEnv;
	}

}
