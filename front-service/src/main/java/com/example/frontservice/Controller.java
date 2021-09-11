package com.example.frontservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Controller {
    @Resource
    MiddleService middleService;

    @GetMapping("/greeting")
    public String hello() {
        return "greeting from front, and " + middleService.greeting();
    }

    @GetMapping("/local")
    public String local() {
        return "front local ";
    }
}
