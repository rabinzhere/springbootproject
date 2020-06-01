package com.crud;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.boot.SpringApplication;



import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories("com.crud.repository")
@EntityScan("com.crud.entity")

@SpringBootApplication
public class MyspringbootcrudapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyspringbootcrudapplicationApplication.class, args);
		
	}

}
