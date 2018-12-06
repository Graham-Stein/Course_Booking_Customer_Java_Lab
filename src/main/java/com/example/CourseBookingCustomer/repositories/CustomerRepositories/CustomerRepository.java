package com.example.CourseBookingCustomer.repositories.CustomerRepositories;

import com.example.CourseBookingCustomer.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
