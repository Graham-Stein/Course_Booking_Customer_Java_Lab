package com.example.CourseBookingCustomer.repositories.CustomerRepositories;

import com.example.CourseBookingCustomer.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom{

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> findAllCustomersOnCourse(Long courseId){
        List<Customer> results;

        Session session = entityManager.unwrap(Session.class);
        Criteria cr = session.createCriteria(Customer.class);
        cr.createAlias("bookings", "booking");
        cr.add(Restrictions.eq("booking.course.id", courseId));
        results = cr.list();
        return results;
    }
//    Get all customers for a given course

}
