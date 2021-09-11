package com.example.frontservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "middle-service" ,url = "${middle-service.url}")
public interface MiddleService {

    @GetMapping("/greeting")
    String greeting();
}
