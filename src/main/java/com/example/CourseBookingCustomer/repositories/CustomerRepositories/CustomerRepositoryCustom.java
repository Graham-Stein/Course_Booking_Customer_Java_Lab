package com.example.CourseBookingCustomer.repositories.CustomerRepositories;

import com.example.CourseBookingCustomer.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> findAllCustomersOnCourse(Long courseId);
}
