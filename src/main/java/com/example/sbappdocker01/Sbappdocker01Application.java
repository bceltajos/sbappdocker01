package com.example.sbappdocker01;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Sbappdocker01Application {

	public static void main(String[] args) {
		SpringApplication.run(Sbappdocker01Application.class, args);
	}

	@Bean
	public ApplicationRunner applicationRunner(){
		return args -> {
			System.out.println("Hello, boot!!!");
		};
	}

}
