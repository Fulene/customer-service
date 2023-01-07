package com.practice.customerservice;

import com.practice.customerservice.services.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerServiceApplication implements CommandLineRunner {
    private final CustomerService customerService;

    public CustomerServiceApplication(CustomerService customerService) {
        this.customerService = customerService;
    }

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Override
    public void run(String... args) {
        customerService.populateDb();
        customerService.findAll().forEach(System.out::println);
    }

}
