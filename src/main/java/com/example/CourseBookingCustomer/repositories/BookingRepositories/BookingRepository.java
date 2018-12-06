package com.example.CourseBookingCustomer.repositories.BookingRepositories;

import com.example.CourseBookingCustomer.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
