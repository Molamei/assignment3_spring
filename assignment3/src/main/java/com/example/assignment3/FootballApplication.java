package com.example.assignment3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "football")
public class FootballApplication {
	public static void main(String[] args) {
		SpringApplication.run(FootballApplication.class, args);
	}
}
