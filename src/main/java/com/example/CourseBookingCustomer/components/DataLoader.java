package com.example.CourseBookingCustomer.components;

import com.example.CourseBookingCustomer.models.Booking;
import com.example.CourseBookingCustomer.models.Course;
import com.example.CourseBookingCustomer.models.Customer;
import com.example.CourseBookingCustomer.repositories.BookingRepositories.BookingRepository;
import com.example.CourseBookingCustomer.repositories.CourseRepositories.CourseRepository;
import com.example.CourseBookingCustomer.repositories.CustomerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        Customer customer = new Customer("Nathan", "Belfast", 10);
        customerRepository.save(customer);
        Customer customer1 = new Customer("Helga", "Prague", 27);
        customerRepository.save(customer1);
        Customer customer2 = new Customer("Robert Bruce", "Stirling", 35);

        Course course = new Course("Jutjistu killer", "Belfast", 5);
        courseRepository.save(course);
        Course course1 = new Course("White Water Rafting", "Denver", 9);
        courseRepository.save(course1);
        Course course2 = new Course("Bunjee Jumping", "Queenstown", 7);
        courseRepository.save(course2);

        Booking booking = new Booking("17-01-2019", customer, course);
        bookingRepository.save(booking);
        Booking booking1 = new Booking("19-04-2019", customer1, course1);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("13-06-1314", customer1, course2);




    }
}


