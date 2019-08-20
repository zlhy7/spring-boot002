package com.renyong.springboot002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:jdbc.properties")
@SpringBootApplication
public class SpringBoot002Application {
	public static void main(String[] args) {
		SpringApplication.run(SpringBoot002Application.class, args);
	}

}
