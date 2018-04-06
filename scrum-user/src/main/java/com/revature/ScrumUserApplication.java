package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ScrumUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScrumUserApplication.class, args);
	}
}
