package com.fjgonmir.fizzBuzz.fizzBuzz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FizzBuzzApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(FizzBuzzApplication.class);

	@Bean
	public CommandLineRunner run(){
		return arg -> {

			for (int i = 0; i <101 ; i++) {
				LOGGER.info(FizzBuzz.getString(i));
			}

		};
	}

	public static void main(String[] args) {
		SpringApplication.run(FizzBuzzApplication.class, args);
	}

}
