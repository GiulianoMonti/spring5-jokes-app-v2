package com.example.jokesgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JokesGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokesGeneratorApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(JokesGeneratorApplication.class, args);


	}

}
