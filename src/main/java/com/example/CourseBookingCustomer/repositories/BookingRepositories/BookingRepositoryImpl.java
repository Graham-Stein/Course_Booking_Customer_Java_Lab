package com.example.CourseBookingCustomer.repositories.BookingRepositories;

import com.example.CourseBookingCustomer.models.Booking;
import com.example.CourseBookingCustomer.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class BookingRepositoryImpl implements BookingRepositoryCustom{

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Booking> findAllBookingsForDate(String date){
        List<Booking> results;

        Session session = entityManager.unwrap(Session.class);
        Criteria cr = session.createCriteria(Booking.class);
        cr.add(Restrictions.eq("date", date));
        results = cr.list();
        return results;
    }
}


//    Get all bookings for a given date