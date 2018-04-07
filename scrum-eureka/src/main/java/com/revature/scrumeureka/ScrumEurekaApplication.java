package com.revature.scrumeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableEurekaServer
public class ScrumEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScrumEurekaApplication.class, args);

	}
}
