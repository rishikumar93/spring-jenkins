package com.javatechie.jenkin.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkinsApplication {

	public static Logger logg=LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
		System.out.print("Application started");
	}
	
	
	@GetMapping("/ping")
	public String message() {
		return "Wao!! Application Deployed successfully in SAP Cloud..";
	}

	public static void main(String[] args) {
		logg.info("Application executed");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
