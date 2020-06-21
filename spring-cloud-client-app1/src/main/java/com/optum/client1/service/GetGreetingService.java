package com.optum.client1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class GetGreetingService {

	@Autowired
	private Environment environment;

	@Autowired
	private GreetingClient greetingClient;

	@GetMapping("/get-greeting")
	public String greeting(Model model) {
		String message = null;
		try {
			message = greetingClient.greeting();
		} catch (Exception e) {
			message = "<div>Unable to get the response from <font style='font-size: 24px;font-weight: 600;'>Client App2</font>, seems the servcie is down.</div>";
		}
		return "<div>Hi! im from Client App1 running on <font style='font-size: 24px;font-weight: 600;'>" + environment.getProperty("local.server.port")
				+ "</font> port. Calling /greeting service from <font style='font-size: 24px;font-weight: 600;'>Client App 2</font>..." + message + "</div>";
	}
}
