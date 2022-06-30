package com.haa.todoer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.haa.todoer")
public class TodoerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoerApplication.class, args);
	}

}
