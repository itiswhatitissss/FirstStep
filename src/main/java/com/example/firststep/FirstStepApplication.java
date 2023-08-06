package com.example.firststep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FirstStepApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstStepApplication.class, args);
	}

}
