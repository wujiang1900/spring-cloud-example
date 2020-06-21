package com.optum.client1.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("clientapp2")
@RequestMapping("/hie-client-app2")
public interface GreetingClient {
    @GetMapping("/greeting")
    public String greeting();
}
