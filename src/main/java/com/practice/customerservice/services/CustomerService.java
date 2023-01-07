package com.practice.customerservice.services;

import com.practice.customerservice.entities.Customer;
import com.practice.customerservice.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void populateDb() {
        customerRepository.saveAll(List.of(
            Customer.builder().name("Mehdi").email("med@gmail.com").build(),
            Customer.builder().name("Hassan").email("has@gmail.com").build(),
            Customer.builder().name("Narjisse").email("narj@gmail.com").build()
        ));
    }

    public Collection<Customer> findAll() {
        return customerRepository.findAll();
    }

}
