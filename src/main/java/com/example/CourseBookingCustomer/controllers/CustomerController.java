package com.example.CourseBookingCustomer.controllers;

import com.example.CourseBookingCustomer.models.Customer;
import com.example.CourseBookingCustomer.repositories.CustomerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping
    public List<Customer> getAllCustomers()
    {
        return customerRepository.findAll();
    }

    @GetMapping(value = "/course/{courseId}")
    public List<Customer> findAllCustomersOnCourse(@PathVariable Long courseId){
        return customerRepository.findAllCustomersOnCourse(courseId);
    }
}
