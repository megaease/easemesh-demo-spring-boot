package com.example.backendservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/greeting")
    public String greeting() {
        return "greeting from backend";
    }

    @GetMapping("/local")
    public String local() {
        return "backend local ";
    }
}
