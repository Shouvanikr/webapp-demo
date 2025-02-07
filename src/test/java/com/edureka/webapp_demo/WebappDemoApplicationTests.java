package com.edureka.webapp_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class WebappDemoApplicationTests {

	public static void main(String[] args) {
			SpringApplication.run(WebappDemoApplicationTests.class, args);
		}

		@GetMapping("/")
		public String hello(){
			return String.format("Hello there welocme to my web application");
		}
	}

