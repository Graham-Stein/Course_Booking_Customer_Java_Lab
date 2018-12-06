package com.example.CourseBookingCustomer.repositories.BookingRepositories;

import com.example.CourseBookingCustomer.models.Booking;

import java.util.List;

public interface BookingRepositoryCustom {
    List<Booking> findAllBookingsForDate(String date);
}
