package com.example.CourseBookingCustomer.repositories.CourseRepositories;

import com.example.CourseBookingCustomer.models.Course;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Course> findAllCoursesByRating(int rating)
    {
        List<Course> result = null;

        Session session = entityManager.unwrap(Session.class);

        Criteria cr = session.createCriteria(Course.class);
        cr.add(Restrictions.eq("rating", rating));
        result = cr.list();

        return result;
    }

//    Get all courses for a given customer

    @Transactional
    public List<Course> findAllCoursesForGivenCustomer(Long customerId){

        List<Course> results = null;

        Session session = entityManager.unwrap(Session.class);
        Criteria cr = session.createCriteria(Course.class);
        cr.createAlias("bookings", "booking");
        cr.add(Restrictions.eq("booking.customer.id", customerId));
        results = cr.list();

        return results;

    }
}
