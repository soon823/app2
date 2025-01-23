package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class App2Application {

	@GetMapping
	public String main() {
		return "docker app 2";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(App2Application.class, args);
	}

}
