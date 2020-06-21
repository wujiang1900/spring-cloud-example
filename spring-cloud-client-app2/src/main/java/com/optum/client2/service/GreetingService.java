package com.optum.client2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class GreetingService {
	
	@Autowired
	private Environment environment;

	@Value("${message:Hello default}")
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@RequestMapping("/greeting")
	public String greeting() {
		return "<div>" + this.message + " from " + "<font style='font-size: 24px;font-weight: 600;'>Client App 2</font> and im running on <font style='font-size: 24px;font-weight: 600;'>" + environment.getProperty("local.server.port") + "</font> port </div>";
	}
}
