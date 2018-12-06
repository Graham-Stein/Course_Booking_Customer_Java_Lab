package com.example.CourseBookingCustomer;

import com.example.CourseBookingCustomer.models.Booking;
import com.example.CourseBookingCustomer.models.Course;
import com.example.CourseBookingCustomer.models.Customer;
import com.example.CourseBookingCustomer.repositories.BookingRepositories.BookingRepository;
import com.example.CourseBookingCustomer.repositories.CourseRepositories.CourseRepository;
import com.example.CourseBookingCustomer.repositories.CustomerRepositories.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseBookingCustomerApplicationTests {

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CourseRepository courseRepository;
	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetACustomer()
	{
		Customer customer = new Customer("Nathan", "Belfast", 10);

		Course course = new Course("Jutjistu killer", "Belfast", 5);

		Booking booking = new Booking("17-01-2019", customer, course);

		customerRepository.save(customer);
		courseRepository.save(course);
		bookingRepository.save(booking);


	}

}
