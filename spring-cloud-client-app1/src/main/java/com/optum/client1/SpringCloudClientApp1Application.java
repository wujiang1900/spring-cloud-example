package com.optum.client1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.optum.client1.service.GreetingClient;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@ComponentScan(basePackages = {"com.optum.client1"})
public class SpringCloudClientApp1Application {

	@Autowired
    private GreetingClient greetingClient;
 
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudClientApp1Application.class, args);
	}
 
    @GetMapping("/get-greeting")
    public String greeting(Model model) {
        return "Hi! " + greetingClient.greeting();
    }

}
