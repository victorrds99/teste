package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteApplication.class, args);
		System.out.println("Testando 123...");
		System.out.println("Testando 456...");
	}

}
