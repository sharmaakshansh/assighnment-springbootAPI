package com.springboot.springrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
//#@ComponentScan(basePackages = "com.springboot.springrest.services")

//@SpringBootApplication(scanBasePackages={"com.springboot.springrest.services"})

@SpringBootApplication
@ComponentScan(basePackages = "com.springboot.springrest")
public class SpringrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestApplication.class, args);
	}

}
