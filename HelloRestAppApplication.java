package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloRestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloRestAppApplication.class, args);
		
		System.out.println("App started");
	}
}
