package com.example.CourseBookingCustomer.controllers;

import com.example.CourseBookingCustomer.models.Booking;
import com.example.CourseBookingCustomer.repositories.BookingRepositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping
    public List<Booking> getAllBookings()
    {
        return bookingRepository.findAll();
    }
}
