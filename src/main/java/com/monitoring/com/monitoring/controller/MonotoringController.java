package com.monitoring.com.monitoring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonotoringController {

    @GetMapping
    public String healthCheck(){
        return "hello contorller";
    }
}
