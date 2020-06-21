package com.optum.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.optum.customer"})
public class SprongCloudCustomerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprongCloudCustomerAppApplication.class, args);
	}

}
