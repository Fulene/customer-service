package com.practice.customerservice.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RefreshScope // Spring Cloud Config annotation to monitor config params
public class CustomerController {

    @Value("${global.params.x}")
    private String x;
    @Value("${global.params.y}")
    private String y;
    @Value("${customer.params.p1}")
    private String p1;
    @Value("${customer.params.p2}")
    private String p2;

    @GetMapping("/params")
    public Map<String, String> checkParams() {
        return Map.of("x", x, "y", y, "p1", p1, "p2", p2);
    }

}
