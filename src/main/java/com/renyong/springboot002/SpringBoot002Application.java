package com.renyong.springboot002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ImportResource(locations = {"classpath:spring/spring-beans.xml"})
@SpringBootApplication
public class SpringBoot002Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot002Application.class, args);
	}

}
