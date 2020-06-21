package com.optum.naming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaServerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaServerAppApplication.class, args);
	}

}
