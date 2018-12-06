package com.example.CourseBookingCustomer.repositories.CourseRepositories;

import com.example.CourseBookingCustomer.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> findAllCoursesByRating(int rating);
    List<Course> findAllCoursesForGivenCustomer(Long customerId);
}
