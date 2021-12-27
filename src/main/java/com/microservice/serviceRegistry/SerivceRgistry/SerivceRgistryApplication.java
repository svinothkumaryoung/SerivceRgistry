package com.microservice.serviceRegistry.SerivceRgistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SerivceRgistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SerivceRgistryApplication.class, args);
	}

}
