package com.example.CourseBookingCustomer.controllers;

import com.example.CourseBookingCustomer.models.Course;
import com.example.CourseBookingCustomer.repositories.CourseRepositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping
    public List<Course> getAllCourses()
    {
        return courseRepository.findAll();
    }

    @GetMapping(value = "/rating/{rating}")
    public List<Course> findAllCoursesByRating(@PathVariable int rating)
    {
        return courseRepository.findAllCoursesByRating(rating);
    }
}
