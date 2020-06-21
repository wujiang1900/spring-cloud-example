package com.optum.client2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.optum.client2"})
public class SpringCloudClientApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudClientApp2Application.class, args);
	}
}
