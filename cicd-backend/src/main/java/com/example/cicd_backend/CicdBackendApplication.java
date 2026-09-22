package com.example.cicd_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicdBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdBackendApplication.class, args);
		System.out.println("Backend is running on 8081...");
	}

}
