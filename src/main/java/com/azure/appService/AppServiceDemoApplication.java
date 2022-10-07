package com.azure.appService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class AppServiceDemoApplication {

	@GetMapping("/message")
	public String message(){
		return "this is the first commit....  .";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AppServiceDemoApplication.class, args);
	}

}
