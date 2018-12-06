package com.example.CourseBookingCustomer.repositories.CourseRepositories;

import com.example.CourseBookingCustomer.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
}
