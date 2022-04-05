package com.fjgonmir.landom.roomwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.fjgonmir.landom.roomwebapp")
@SpringBootApplication
public class RoomWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomWebAppApplication.class, args);
	}

}
