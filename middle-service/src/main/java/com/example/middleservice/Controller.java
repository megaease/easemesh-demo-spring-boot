package com.example.middleservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class Controller {
    @Resource
    RestTemplate restTemplate;

    @Value("${backend-service.url}")
    String backendServiceUrl;

    @GetMapping("/greeting")
    public String greeting() {
        return "greeting from middle service, and " +
                restTemplate.getForObject(backendServiceUrl + "/greeting", String.class);
    }

    @GetMapping("/local")
    public String local() {
        return "middle local ";
    }
}
